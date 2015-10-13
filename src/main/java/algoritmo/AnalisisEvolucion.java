/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoritmo;

import com.personal.utiles.FechaUtil;
import controladores.AsignacionHorarioControlador;
import controladores.ContratoControlador;
import controladores.FeriadoControlador;
import controladores.MarcacionControlador;
import controladores.PermisoControlador;
import controladores.VacacionControlador;
import entidades.AsignacionHorario;
import entidades.DetalleJornada;
import entidades.Feriado;
import entidades.Jornada;
import entidades.Marcacion;
import entidades.Permiso;
import entidades.Turno;
import entidades.Vacacion;
import entidades.escalafon.Empleado;
import entidades.reportes.RptAsistencia;
import entidades.reportes.RptAsistenciaDetalle;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.NoSuchElementException;

/**
 *
 * @author Francis
 */
public class AnalisisEvolucion {

    private List<Permiso> permisos;
    private List<Vacacion> vacaciones;
    private List<Feriado> feriados;
    private List<Marcacion> marcaciones;

    private final FeriadoControlador ferc;
    private final PermisoControlador permc;
    private final VacacionControlador vacc;
    private final MarcacionControlador marcc;
    private final ContratoControlador contc;
    private final AsignacionHorarioControlador asghorc;

//    private final RptAsistencia asistenciaList;
    public AnalisisEvolucion() {
        permc = new PermisoControlador();
        ferc = new FeriadoControlador();
        vacc = new VacacionControlador();
        marcc = new MarcacionControlador();
        asghorc = new AsignacionHorarioControlador();
        contc = ContratoControlador.getInstance();
    }

    public List<RptAsistencia> iniciarAnalisis(List<Empleado> empleadoList, Date fechaInicio, Date fechaFin) {
        List<RptAsistencia> asistenciaList = new ArrayList<>();
        cargarFeriados(fechaInicio, fechaFin);
        empleadoList.stream().forEach(empleado -> {
            this.cargarMarcacionesPorEmpleadoEntreFecha(empleado, fechaInicio, fechaFin);
            this.cargarPermisosPorEmpleadoEntreFecha(empleado, fechaInicio, fechaFin);
            this.cargarVacacionesPorEmpleadoEntreFecha(empleado, fechaInicio, fechaFin);
            Date desde1 = fechaInicio;
            Date hasta1 = fechaFin;
            List<AsignacionHorario> asignaciones = asghorc.buscarXEmpleado(empleado, desde1, hasta1);

            asignaciones.stream().forEach((asignacion) -> {
                Date desde2 = desde1.before(asignacion.getFechaInicio()) ? asignacion.getFechaInicio() : desde1;
                Date hasta2 = hasta1.before(asignacion.getFechaFin()) ? hasta1 : asignacion.getFechaFin();

                Calendar iteradorIda = Calendar.getInstance();
                Calendar iteradorVuelta = Calendar.getInstance();

                iteradorIda.setTime(desde2);
                iteradorVuelta.setTime(hasta2);

                while (iteradorIda.compareTo(iteradorVuelta) <= 0) {
                    if (iteradorIda.equals(iteradorVuelta)) {
                        asistenciaList.addAll(analizarDia(empleado, iteradorIda.getTime(), asignacion));
                    } else {
                        asistenciaList.addAll(analizarDia(empleado, iteradorIda.getTime(), asignacion));
                        asistenciaList.addAll(analizarDia(empleado, iteradorVuelta.getTime(), asignacion));
                    }

                    iteradorIda.add(Calendar.DATE, 1);
                    iteradorVuelta.add(Calendar.DATE, -1);
                }
            });
//            });
        });

        return asistenciaList;
    }

    private void cargarFeriados(Date fechaInicio, Date fechaFin) {
        this.feriados = ferc.buscarXFechas(fechaInicio, fechaFin);
    }

    private void cargarPermisosPorEmpleadoEntreFecha(Empleado empleado, Date fechaInicio, Date fechaFin) {
        this.permisos = permc.buscarXEmpleadoEntreFecha(empleado, fechaInicio, fechaFin, true);
    }

    private void cargarVacacionesPorEmpleadoEntreFecha(Empleado empleado, Date fechaInicio, Date fechaFin) {
        this.vacaciones = vacc.buscarXEmpleadoEntreFecha(empleado, fechaInicio, fechaFin);
    }

    private void cargarMarcacionesPorEmpleadoEntreFecha(Empleado empleado, Date fechaInicio, Date fechaFin) {
        this.marcaciones = marcc.buscarXFecha(empleado, fechaInicio, fechaFin, -1, -1);
    }

    private Feriado feriadoEnFecha(Date fecha) {
        try {
            Feriado feriado = this.feriados
                    .stream()
                    .filter(f -> f.getFechaInicio().compareTo(fecha) <= 0 && f.getFechaFin().compareTo(fecha) >= 0)
                    .findFirst()
                    .get();
            return feriado;
        } catch (NoSuchElementException e) {
            System.out.println("NO HAY FERIADOS");
            return null;
        }

    }

    private Vacacion vacacionEnFecha(Date fecha) {
        try {
            Vacacion vacacion = this.vacaciones
                    .stream()
                    .filter(v -> v.getFechaInicio().compareTo(fecha) <= 0 && v.getFechaFin().compareTo(fecha) >= 0)
                    .findFirst()
                    .get();
            return vacacion;
        } catch (NoSuchElementException e) {
            System.out.println("NO HAY VACACIONES");
            return null;
        }

    }

    private Permiso permisoXFechaEnFecha(Date fecha) {
        try {
            Permiso permiso = this.permisos
                    .stream()
                    .filter(p -> p.getFechaInicio().compareTo(fecha) <= 0 && p.getFechaFin().compareTo(fecha) >= 0)
                    .findFirst()
                    .get();
            return permiso;
        } catch (NoSuchElementException e) {
            System.out.println("NO HAY PERMISOS POR FECHA");
            return null;
        }

    }

    private Marcacion marcacionEnFechaEntreHora(Date fecha, Date horaInicio, Date horaFin) {
        Date fechaHoraInicio = FechaUtil.unirFechaHora(fecha, horaInicio);
        Date fechaHoraFin = FechaUtil.unirFechaHora(fecha, horaFin);

        try {
            Marcacion marcacion = this.marcaciones
                    .stream()
                    .filter(m -> m.getFechaHora().compareTo(fechaHoraInicio) >= 0 && m.getFechaHora().compareTo(fechaHoraFin) <= 0)
                    .findFirst()
                    .get();

            return marcacion;
        } catch (NoSuchElementException e) {
            System.out.println("NO HAY MARCACION: ");
            return null;
        }

    }

    private boolean isDiaLaboral(Date fecha, Turno turno) {
        if (turno.getTipo() == 'S') {
            Calendar cal = Calendar.getInstance();
            cal.setTime(fecha);

            switch (cal.get(Calendar.DAY_OF_WEEK)) {
                case Calendar.MONDAY:
                    return turno.isLunes();
                case Calendar.TUESDAY:
                    return turno.isMartes();
                case Calendar.WEDNESDAY:
                    return turno.isMiercoles();
                case Calendar.THURSDAY:
                    return turno.isJueves();
                case Calendar.FRIDAY:
                    return turno.isViernes();
                case Calendar.SATURDAY:
                    return turno.isSabado();
                case Calendar.SUNDAY:
                    return turno.isDomingo();
                default:
                    return false;
            }
        } else {
            return turno.getFechaInicio().compareTo(fecha) <= 0
                    && turno.getFechaFin().compareTo(fecha) >= 0;
        }
    }

    private List<RptAsistencia> analizarDia(Empleado empleado, Date dia, AsignacionHorario asignacion) {
        List<Turno> turnos = asignacion.getHorario().getTurnoList();
        List<RptAsistencia> asistencia = new ArrayList<>();

        turnos.stream().forEach(turno -> {
            Permiso permisoXFecha;
            Vacacion vacacion;
            Feriado feriado;
            RptAsistencia rptAsistencia = null;

            if ((permisoXFecha = this.permisoXFechaEnFecha(dia)) != null) {
                //SI EXISTE PERMISO
                rptAsistencia = new RptAsistencia();
                rptAsistencia.setPermiso(permisoXFecha);
                rptAsistencia.setTipo("P");
                rptAsistencia.setEmpleado(empleado);
                rptAsistencia.setFecha(dia);

            } else if ((vacacion = this.vacacionEnFecha(dia)) != null) {
                //SI EXISTE VACACION
                rptAsistencia = new RptAsistencia();
                rptAsistencia.setVacacion(vacacion);
                rptAsistencia.setTipo("V");
                rptAsistencia.setEmpleado(empleado);
                rptAsistencia.setFecha(dia);
            } else if ((feriado = this.feriadoEnFecha(dia)) != null) {
                //EXISTE FERIADO
                rptAsistencia = new RptAsistencia();
                rptAsistencia.setFeriado(feriado);
                rptAsistencia.setTipo("F");
                rptAsistencia.setEmpleado(empleado);
                rptAsistencia.setFecha(dia);
            } else if (this.isDiaLaboral(dia, turno)) {
                //ES DÍA LABORAL
                rptAsistencia = new RptAsistencia();
                rptAsistencia.setTipo("A");
                rptAsistencia.setEmpleado(empleado);
                rptAsistencia.setFecha(dia);
                //TRAER DETALLES
                Jornada jornada = turno.getJornada();
                DetalleJornada detalle1 = jornada.getDetalleJornadaList().get(0);
                DetalleJornada detalle2 = jornada.getDetalleJornadaList().get(1);

                Marcacion entradaDetalle1 = this.marcacionEnFechaEntreHora(dia, detalle1.getEntradaDesde(), detalle1.getEntradaHasta());
                Marcacion salidaDetalle1 = this.marcacionEnFechaEntreHora(dia, detalle1.getSalidaDesde(), detalle1.getSalidaHasta());

                Marcacion entradaDetalle2 = this.marcacionEnFechaEntreHora(dia, detalle2.getEntradaDesde(), detalle2.getEntradaHasta());
                Marcacion salidaDetalle2 = this.marcacionEnFechaEntreHora(dia, detalle2.getSalidaDesde(), detalle2.getSalidaHasta());

                RptAsistenciaDetalle asistenciaDetalle1 = new RptAsistenciaDetalle();
                RptAsistenciaDetalle asistenciaDetalle2 = new RptAsistenciaDetalle();

                asistenciaDetalle1.setDetalleJornada(detalle1);
                asistenciaDetalle1.setHoraEntrada(entradaDetalle1 == null ? null : FechaUtil.soloHora(entradaDetalle1.getFechaHora()));
                asistenciaDetalle1.setHoraSalida(salidaDetalle1 == null ? null : FechaUtil.soloHora(salidaDetalle1.getFechaHora()));

                asistenciaDetalle2.setDetalleJornada(detalle2);
                asistenciaDetalle2.setHoraEntrada(entradaDetalle2 == null ? null : FechaUtil.soloHora(entradaDetalle2.getFechaHora()));
                asistenciaDetalle2.setHoraSalida(salidaDetalle2 == null ? null : FechaUtil.soloHora(salidaDetalle2.getFechaHora()));

                rptAsistencia.setDetalle1(asistenciaDetalle1);
                rptAsistencia.setDetalle2(asistenciaDetalle2);

                rptAsistencia.setJornada(jornada);

            } else {
                //NOTHING TO DO
            }

            if (rptAsistencia != null) {
                System.out.println("DETALLE 1: " + rptAsistencia.getDetalle1().getDetalleJornada());
                asistencia.add(rptAsistencia);
            }
        });

        return asistencia;
    }

}
