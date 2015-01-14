/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biz.juvitec.vistas;

import biz.juvitec.dao.DAO;
import biz.juvitec.dao.DAOBIOSTAR;
import biz.juvitec.dao.DAOMINEDU;
import biz.juvitec.entidades.Empleado;
import biz.juvitec.entidades.Marcacion;
import biz.juvitec.entidades.Usuario;
import biz.juvitec.vistas.mantenimientos.CRUDAnioFeriados;
import biz.juvitec.vistas.mantenimientos.CRUDGrupoHorario;
import biz.juvitec.vistas.mantenimientos.CRUDHorario;
import biz.juvitec.vistas.mantenimientos.CRUDJornada;
import biz.juvitec.vistas.mantenimientos.CRUDPeriodo;
import biz.juvitec.vistas.mantenimientos.CRUDTipoPermiso;
import biz.juvitec.vistas.reportes.RptPermisos;
import biz.juvitec.vistas.reportes.RptRegistroAsistencia;
import biz.juvitec.vistas.reportes.RptVacaciones;
import com.personal.utiles.ImagenFondo;
import com.personal.utiles.ReporteUtil;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.event.MouseMotionListener;
import java.beans.PropertyVetoException;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JInternalFrame;
import javax.swing.UIManager;
import javax.swing.UIManager.LookAndFeelInfo;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import utiles.UsuarioActivo;

/**
 *
 * @author fesquivelc
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public Principal() {
        initComponents();

        File file = new File("img/fondo-minedu.jpg");
        ImagenFondo borde;
        try {
            borde = new ImagenFondo(ImageIO.read(file));
            this.desktopPane.setBorder(borde);
        } catch (IOException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
//        iniciar();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jSeparator2 = new javax.swing.JSeparator();
        desktopPane = new javax.swing.JDesktopPane();
        jSeparator1 = new javax.swing.JSeparator();
        pnlBotnes = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        lblJuvitec = new javax.swing.JLabel();
        lblUsuario = new javax.swing.JLabel();
        menuBar = new javax.swing.JMenuBar();
        editMenu = new javax.swing.JMenu();
        mnuVerEmpleados = new javax.swing.JMenuItem();
        mnuMarcacionesSinProcesar = new javax.swing.JMenuItem();
        mnuMarcacionesTR = new javax.swing.JMenuItem();
        copyMenuItem = new javax.swing.JMenuItem();
        fileMenu = new javax.swing.JMenu();
        mnuJornadas = new javax.swing.JMenuItem();
        mnuHorarios = new javax.swing.JMenuItem();
        mnuGruposHorario = new javax.swing.JMenuItem();
        mnuAsignarHorario = new javax.swing.JMenuItem();
        mnuSalir = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        mnuTiposPermiso = new javax.swing.JMenuItem();
        mnuAsignarPermiso = new javax.swing.JMenuItem();
        mnuAsignarVacaciones = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        helpMenu = new javax.swing.JMenu();
        mnuPeriodos = new javax.swing.JMenuItem();
        mnuUsuarios = new javax.swing.JMenuItem();
        mnuRolesUsuario = new javax.swing.JMenuItem();
        mnuConfiguracionBD = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SISTEMA DE CONTROL DE ASISTENCIA DE PERSONAL - BIOSIS MINEDU");
        java.awt.GridBagLayout layout = new java.awt.GridBagLayout();
        layout.columnWidths = new int[] {0, 10, 0};
        layout.rowHeights = new int[] {0, 10, 0, 10, 0};
        getContentPane().setLayout(layout);

        desktopPane.setDragMode(javax.swing.JDesktopPane.OUTLINE_DRAG_MODE);
        desktopPane.add(jSeparator1);
        jSeparator1.setBounds(180, 30, 0, 2);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 1014;
        gridBagConstraints.ipady = 616;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.weighty = 0.1;
        getContentPane().add(desktopPane, gridBagConstraints);

        java.awt.GridBagLayout pnlBotnesLayout = new java.awt.GridBagLayout();
        pnlBotnesLayout.columnWidths = new int[] {0, 10, 0, 10, 0, 10, 0, 10, 0, 10, 0};
        pnlBotnesLayout.rowHeights = new int[] {0};
        pnlBotnes.setLayout(pnlBotnesLayout);

        jButton1.setText("Empleados");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        pnlBotnes.add(jButton1, gridBagConstraints);

        jButton2.setText("Marcaciones");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        pnlBotnes.add(jButton2, gridBagConstraints);

        jButton3.setText("Asignar permisos");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 0;
        pnlBotnes.add(jButton3, gridBagConstraints);

        jButton4.setText("Horarios");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 8;
        gridBagConstraints.gridy = 0;
        pnlBotnes.add(jButton4, gridBagConstraints);

        jButton5.setText("Registro de asistencia");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 10;
        gridBagConstraints.gridy = 0;
        pnlBotnes.add(jButton5, gridBagConstraints);

        jButton6.setText("Marcaciones en Tiempo Real");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 0;
        pnlBotnes.add(jButton6, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        getContentPane().add(pnlBotnes, gridBagConstraints);

        lblJuvitec.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblJuvitec.setText("SERVICIOS INFORMÁTICOS JUVITEC S.R.L.");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        getContentPane().add(lblJuvitec, gridBagConstraints);

        lblUsuario.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblUsuario.setText("Usuario:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        getContentPane().add(lblUsuario, gridBagConstraints);

        editMenu.setMnemonic('e');
        editMenu.setText("Empleados");

        mnuVerEmpleados.setMnemonic('t');
        mnuVerEmpleados.setText("Ver empleados");
        mnuVerEmpleados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuVerEmpleadosActionPerformed(evt);
            }
        });
        editMenu.add(mnuVerEmpleados);

        mnuMarcacionesSinProcesar.setText("Marcaciones sin procesar");
        mnuMarcacionesSinProcesar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuMarcacionesSinProcesarActionPerformed(evt);
            }
        });
        editMenu.add(mnuMarcacionesSinProcesar);

        mnuMarcacionesTR.setText("Marcaciones en tiempo real");
        editMenu.add(mnuMarcacionesTR);

        copyMenuItem.setMnemonic('y');
        copyMenuItem.setText("Prueba");
        copyMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                copyMenuItemActionPerformed(evt);
            }
        });
        editMenu.add(copyMenuItem);

        menuBar.add(editMenu);

        fileMenu.setMnemonic('f');
        fileMenu.setText("Horarios");

        mnuJornadas.setMnemonic('o');
        mnuJornadas.setText("Jornadas");
        mnuJornadas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuJornadasActionPerformed(evt);
            }
        });
        fileMenu.add(mnuJornadas);

        mnuHorarios.setMnemonic('s');
        mnuHorarios.setText("Horarios");
        mnuHorarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuHorariosActionPerformed(evt);
            }
        });
        fileMenu.add(mnuHorarios);

        mnuGruposHorario.setText("Grupos horario");
        mnuGruposHorario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuGruposHorarioActionPerformed(evt);
            }
        });
        fileMenu.add(mnuGruposHorario);

        mnuAsignarHorario.setText("Asignar horario");
        mnuAsignarHorario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuAsignarHorarioActionPerformed(evt);
            }
        });
        fileMenu.add(mnuAsignarHorario);

        mnuSalir.setMnemonic('x');
        mnuSalir.setText("Salir");
        mnuSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuSalirActionPerformed(evt);
            }
        });
        fileMenu.add(mnuSalir);

        menuBar.add(fileMenu);

        jMenu1.setText("Permisos");

        mnuTiposPermiso.setText("Tipos de permiso");
        mnuTiposPermiso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuTiposPermisoActionPerformed(evt);
            }
        });
        jMenu1.add(mnuTiposPermiso);

        mnuAsignarPermiso.setText("Asignar permiso");
        mnuAsignarPermiso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuAsignarPermisoActionPerformed(evt);
            }
        });
        jMenu1.add(mnuAsignarPermiso);

        mnuAsignarVacaciones.setText("Asignar vacaciones");
        mnuAsignarVacaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuAsignarVacacionesActionPerformed(evt);
            }
        });
        jMenu1.add(mnuAsignarVacaciones);

        menuBar.add(jMenu1);

        jMenu2.setText("Reportes");

        jMenuItem1.setText("Reportes de asistencia");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem1);

        jMenuItem2.setText("Reportes de permisos / licencias / comisiones de servicio");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem2);

        jMenuItem3.setText("Reportes de vacaciones");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem3);

        menuBar.add(jMenu2);

        helpMenu.setMnemonic('h');
        helpMenu.setText("Configuración");

        mnuPeriodos.setMnemonic('a');
        mnuPeriodos.setText("Períodos");
        mnuPeriodos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuPeriodosActionPerformed(evt);
            }
        });
        helpMenu.add(mnuPeriodos);

        mnuUsuarios.setText("Usuarios");
        helpMenu.add(mnuUsuarios);

        mnuRolesUsuario.setText("Roles de usuario");
        helpMenu.add(mnuRolesUsuario);

        mnuConfiguracionBD.setText("Configuración de BD");
        mnuConfiguracionBD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuConfiguracionBDActionPerformed(evt);
            }
        });
        helpMenu.add(mnuConfiguracionBD);

        menuBar.add(helpMenu);

        setJMenuBar(menuBar);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mnuSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_mnuSalirActionPerformed

    private void mnuVerEmpleadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuVerEmpleadosActionPerformed
        // TODO add your handling code here:
        empleados();
    }//GEN-LAST:event_mnuVerEmpleadosActionPerformed

    private void mnuConfiguracionBDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuConfiguracionBDActionPerformed
        // TODO add your handling code here:
        Configuracion configBD = new Configuracion();
        agregarAPanel(configBD, this.getSize().width, 450);

        BasicInternalFrameUI ui = (BasicInternalFrameUI) configBD.getUI();
        Component northPane = ui.getNorthPane();
        MouseMotionListener[] motionListeners = (MouseMotionListener[]) northPane.getListeners(MouseMotionListener.class);

        for (MouseMotionListener listener : motionListeners) {
            northPane.removeMouseMotionListener(listener);
        }
    }//GEN-LAST:event_mnuConfiguracionBDActionPerformed

    private void mnuJornadasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuJornadasActionPerformed
        // TODO add your handling code here:
        CRUDJornada jornadas = new CRUDJornada();
        agregarAPanel(jornadas, true);
    }//GEN-LAST:event_mnuJornadasActionPerformed

    private void mnuHorariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuHorariosActionPerformed
        // TODO add your handling code here:
        horarios();

    }//GEN-LAST:event_mnuHorariosActionPerformed

    private void mnuPeriodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuPeriodosActionPerformed
        // TODO add your handling code here:
        CRUDPeriodo periodos = new CRUDPeriodo();
        agregarAPanel(periodos, true);
    }//GEN-LAST:event_mnuPeriodosActionPerformed

    private void mnuGruposHorarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuGruposHorarioActionPerformed
        // TODO add your handling code here:
        CRUDGrupoHorario grupos = new CRUDGrupoHorario();
        agregarAPanel(grupos, true);
    }//GEN-LAST:event_mnuGruposHorarioActionPerformed

    private void mnuMarcacionesSinProcesarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuMarcacionesSinProcesarActionPerformed
        // TODO add your handling code here:
        marcaciones();

    }//GEN-LAST:event_mnuMarcacionesSinProcesarActionPerformed

    private void mnuAsignarHorarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuAsignarHorarioActionPerformed
        // TODO add your handling code here:
        FrmAsignacionHorario asignacion = new FrmAsignacionHorario();
        agregarAPanel(asignacion, true);
    }//GEN-LAST:event_mnuAsignarHorarioActionPerformed

    private void mnuTiposPermisoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuTiposPermisoActionPerformed
        // TODO add your handling code here:
        CRUDTipoPermiso tipos = new CRUDTipoPermiso();
        agregarAPanel(tipos, true);
    }//GEN-LAST:event_mnuTiposPermisoActionPerformed

    private void mnuAsignarPermisoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuAsignarPermisoActionPerformed
        // TODO add your handling code here:
        permiso();
    }//GEN-LAST:event_mnuAsignarPermisoActionPerformed

    private void mnuAsignarVacacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuAsignarVacacionesActionPerformed
        // TODO add your handling code here:
        AsignarVacacion asignar = new AsignarVacacion();
        agregarAPanel(asignar, true);
    }//GEN-LAST:event_mnuAsignarVacacionesActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        empleados();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        marcaciones();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        permiso();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        horarios();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        registroAsistencia();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        marcacionesTR();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void copyMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_copyMenuItemActionPerformed
        // TODO add your handling code here:
        List<String> dnis = new ArrayList<>();
        dnis.add("46557081");
        dnis.add("18033904");
        ReporteUtil util = new ReporteUtil();
        util.setConn(dao.getConexion());
        Map<String, Object> mapa = new HashMap<>();
        mapa.put("lista", dnis);
        mapa.put("usuario", UsuarioActivo.getUsuario().getLogin());
        mapa.put("CONEXION_EMPLEADOS", dao3.getConexion());
        File reporte = new File("reportes/r_boleta_vacaciones.jasper");
        util.generarReporte(reporte, mapa, this);
    }//GEN-LAST:event_copyMenuItemActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        reporteAsistencia();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
        reportePermiso();
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        // TODO add your handling code here:
        reporteVacaciones();
    }//GEN-LAST:event_jMenuItem3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem copyMenuItem;
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JMenu editMenu;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JMenu helpMenu;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lblJuvitec;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenuItem mnuAsignarHorario;
    private javax.swing.JMenuItem mnuAsignarPermiso;
    private javax.swing.JMenuItem mnuAsignarVacaciones;
    private javax.swing.JMenuItem mnuConfiguracionBD;
    private javax.swing.JMenuItem mnuGruposHorario;
    private javax.swing.JMenuItem mnuHorarios;
    private javax.swing.JMenuItem mnuJornadas;
    private javax.swing.JMenuItem mnuMarcacionesSinProcesar;
    private javax.swing.JMenuItem mnuMarcacionesTR;
    private javax.swing.JMenuItem mnuPeriodos;
    private javax.swing.JMenuItem mnuRolesUsuario;
    private javax.swing.JMenuItem mnuSalir;
    private javax.swing.JMenuItem mnuTiposPermiso;
    private javax.swing.JMenuItem mnuUsuarios;
    private javax.swing.JMenuItem mnuVerEmpleados;
    private javax.swing.JPanel pnlBotnes;
    // End of variables declaration//GEN-END:variables

    private void agregarAPanel(JInternalFrame internal) {
        this.agregarAPanel(internal, false);
    }

    private void agregarAPanel(JInternalFrame internal, boolean maximizar) {
        if (!this.desktopPane.isAncestorOf(internal)) {
            this.desktopPane.add(internal);
            internal.setVisible(true);
            try {
                internal.setMaximum(maximizar);
            } catch (PropertyVetoException ex) {
                Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    private void agregarAPanel(JInternalFrame internal, int ancho, int largo) {
        if (!this.desktopPane.isAncestorOf(internal)) {
            this.desktopPane.add(internal);
            internal.setSize(ancho, largo);
            internal.setVisible(true);
            Dimension desktopSize = desktopPane.getSize();
            Dimension jInternalFrameSize = internal.getSize();
            internal.setLocation((desktopSize.width - jInternalFrameSize.width) / 2,
                    (desktopSize.height - jInternalFrameSize.height) / 2);
        }
    }
    DAO dao;
    DAOMINEDU dao3;

    private void iniciar() {
        dao = new DAO();
        dao.getEntityManager();
        DAOBIOSTAR dao2 = new DAOBIOSTAR(Marcacion.class);
        dao3 = new DAOMINEDU(Empleado.class);
        dao2.getEntityManager();
        dao3.getEntityManager();
    }

    private void empleados() {
        VistaEmpleado ve = new VistaEmpleado();
        agregarAPanel(ve, true);
    }

    private void marcaciones() {
        VistaMarcaciones marcaciones = new VistaMarcaciones();
        agregarAPanel(marcaciones, true);
    }

    private void permiso() {
        AsignarPermiso asignar = new AsignarPermiso();
        agregarAPanel(asignar, true);
    }

    private void horarios() {
        CRUDHorario horarios = new CRUDHorario();
        agregarAPanel(horarios, true);
    }

    private void registroAsistencia() {
        VistaRegistroAsistencia registroAsistencia = new VistaRegistroAsistencia();
        agregarAPanel(registroAsistencia, true);
    }

    private void marcacionesTR() {
        VistaMarcacionesTR mtr = new VistaMarcacionesTR();
        agregarAPanel(mtr, true);
    }

    public void setUsuario(Usuario u) {
        if (u != null) {
            UsuarioActivo.setUsuario(u);
            lblUsuario.setText("Usuario: " + u.getLogin() + " Rol: " + u.getRol().getNombre());
        } else {
            System.out.println("USUARIO NULL =(");
        }
    }

    private void reporteAsistencia() {
        RptRegistroAsistencia asistencia = new RptRegistroAsistencia();
        agregarAPanel(asistencia, true);
    }

    private void reportePermiso() {
        RptPermisos permisos = new RptPermisos();
//        agregarAPanel(permisos, 1024, 864);
        agregarAPanel(permisos, true);
    }

    private void reporteVacaciones() {
        RptVacaciones vacaciones = new RptVacaciones();
        agregarAPanel(vacaciones, true);
    }
}
