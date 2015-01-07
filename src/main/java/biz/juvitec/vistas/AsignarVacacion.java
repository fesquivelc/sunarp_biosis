/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biz.juvitec.vistas;

import biz.juvitec.controladores.Controlador;
import biz.juvitec.controladores.EmpleadoControlador;
import biz.juvitec.controladores.PeriodoControlador;
import biz.juvitec.controladores.VacacionControlador;
import biz.juvitec.entidades.AsignacionPermiso;
import biz.juvitec.entidades.Empleado;
import biz.juvitec.entidades.Periodo;
import biz.juvitec.entidades.TipoPermiso;
import biz.juvitec.entidades.Vacacion;
import biz.juvitec.vistas.dialogos.DlgEmpleado;
import biz.juvitec.vistas.dialogos.DlgInterrupcionVacacion;
import biz.juvitec.vistas.modelos.MTAsignarVacacion;
import biz.juvitec.vistas.modelos.MTEmpleado;
import com.personal.utiles.FormularioUtil;
import java.awt.Component;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.DefaultListCellRenderer;
import javax.swing.JList;
import javax.swing.SpinnerNumberModel;
import org.jdesktop.beansbinding.AutoBinding;
import org.jdesktop.observablecollections.ObservableCollections;
import org.jdesktop.swingbinding.JComboBoxBinding;
import org.jdesktop.swingbinding.SwingBindings;

/**
 *
 * @author fesquivelc
 */
public class AsignarVacacion extends javax.swing.JInternalFrame {

    /**
     * Creates new form CRUDPeriodo
     */
    private List<Vacacion> listado;
    private List<Empleado> integrantes;
    private VacacionControlador controlador;
    private EmpleadoControlador ec;
    private int accion;
    private TipoPermiso tipoSeleccionado;
    private Empleado empleadoBusqueda;
    private Empleado empleadoSeleccionado;
    private PeriodoControlador pc;

    public AsignarVacacion() {
        initComponents();
        inicializar();
        bindeoSalvaje();
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

        pnlListado = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        btnNuevo = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblTabla = new org.jdesktop.swingx.JXTable();
        lblBusqueda = new org.jdesktop.swingx.JXBusyLabel();
        txtEmpleado = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        spFechaInicio1 = new javax.swing.JSpinner();
        jLabel9 = new javax.swing.JLabel();
        spFechaFin1 = new javax.swing.JSpinner();
        btnBuscar = new javax.swing.JButton();
        pnlNavegacion = new javax.swing.JPanel();
        btnPrimero = new javax.swing.JButton();
        btnAnterior = new javax.swing.JButton();
        spPagina = new javax.swing.JSpinner();
        txtTotal = new javax.swing.JTextField();
        btnSiguiente = new javax.swing.JButton();
        btnUltimo = new javax.swing.JButton();
        cboTamanio = new javax.swing.JComboBox();
        jCheckBox1 = new javax.swing.JCheckBox();
        pnlDatos = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtEmpleadoSeleccionado = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        pnlFHInicio = new javax.swing.JPanel();
        spFechaFin = new javax.swing.JSpinner();
        pnlFHInicio1 = new javax.swing.JPanel();
        spFechaInicio = new javax.swing.JSpinner();
        jLabel7 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        cboPeriodo = new javax.swing.JComboBox();
        jPanel5 = new javax.swing.JPanel();
        btnGuardar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setTitle("ASIGNAR VACACIONES A EMPLEADO");
        java.awt.GridBagLayout layout = new java.awt.GridBagLayout();
        layout.columnWidths = new int[] {0, 5, 0};
        layout.rowHeights = new int[] {0};
        getContentPane().setLayout(layout);

        pnlListado.setBorder(javax.swing.BorderFactory.createTitledBorder("Permisos"));
        java.awt.GridBagLayout jPanel1Layout = new java.awt.GridBagLayout();
        jPanel1Layout.columnWidths = new int[] {0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0};
        jPanel1Layout.rowHeights = new int[] {0, 5, 0, 5, 0, 5, 0};
        pnlListado.setLayout(jPanel1Layout);

        jPanel3.setLayout(new java.awt.GridLayout(1, 0, 10, 0));

        btnNuevo.setText("Nuevo");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });
        jPanel3.add(btnNuevo);

        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });
        jPanel3.add(btnModificar);

        jButton2.setText("Registrar interrupción");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton2);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.gridwidth = 15;
        pnlListado.add(jPanel3, gridBagConstraints);

        tblTabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblTabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tblTablaMouseReleased(evt);
            }
        });
        jScrollPane1.setViewportView(tblTabla);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 15;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.weighty = 0.1;
        pnlListado.add(jScrollPane1, gridBagConstraints);

        lblBusqueda.setText("Empleado");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        pnlListado.add(lblBusqueda, gridBagConstraints);

        txtEmpleado.setEditable(false);
        txtEmpleado.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtEmpleadoKeyReleased(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.1;
        pnlListado.add(txtEmpleado, gridBagConstraints);

        jButton4.setText("...");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        pnlListado.add(jButton4, gridBagConstraints);

        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        pnlListado.add(btnLimpiar, gridBagConstraints);

        spFechaInicio1.setModel(new javax.swing.SpinnerDateModel());
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 8;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        pnlListado.add(spFechaInicio1, gridBagConstraints);

        jLabel9.setText("-");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 10;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        pnlListado.add(jLabel9, gridBagConstraints);

        spFechaFin1.setModel(new javax.swing.SpinnerDateModel());
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 12;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        pnlListado.add(spFechaFin1, gridBagConstraints);

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 14;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        pnlListado.add(btnBuscar, gridBagConstraints);

        pnlNavegacion.setLayout(new java.awt.GridLayout(1, 0, 2, 0));

        btnPrimero.setText("<<");
        btnPrimero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrimeroActionPerformed(evt);
            }
        });
        pnlNavegacion.add(btnPrimero);

        btnAnterior.setText("<");
        btnAnterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnteriorActionPerformed(evt);
            }
        });
        pnlNavegacion.add(btnAnterior);

        spPagina.setModel(new javax.swing.SpinnerNumberModel(Integer.valueOf(1), Integer.valueOf(1), null, Integer.valueOf(1)));
        spPagina.setMinimumSize(new java.awt.Dimension(60, 20));
        spPagina.setPreferredSize(new java.awt.Dimension(60, 20));
        spPagina.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spPaginaStateChanged(evt);
            }
        });
        pnlNavegacion.add(spPagina);

        txtTotal.setEditable(false);
        txtTotal.setColumns(3);
        txtTotal.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtTotal.setText("1");
        pnlNavegacion.add(txtTotal);

        btnSiguiente.setText(">");
        btnSiguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSiguienteActionPerformed(evt);
            }
        });
        pnlNavegacion.add(btnSiguiente);

        btnUltimo.setText(">>");
        btnUltimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUltimoActionPerformed(evt);
            }
        });
        pnlNavegacion.add(btnUltimo);

        cboTamanio.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "5", "10", "15", "20", "25", "40", "50" }));
        cboTamanio.setMinimumSize(new java.awt.Dimension(53, 24));
        cboTamanio.setPreferredSize(new java.awt.Dimension(53, 24));
        cboTamanio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboTamanioActionPerformed(evt);
            }
        });
        pnlNavegacion.add(cboTamanio);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 15;
        pnlListado.add(pnlNavegacion, gridBagConstraints);

        jCheckBox1.setText("Empleado:");
        pnlListado.add(jCheckBox1, new java.awt.GridBagConstraints());

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.2;
        gridBagConstraints.weighty = 0.1;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        getContentPane().add(pnlListado, gridBagConstraints);

        pnlDatos.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos de permiso"));
        java.awt.GridBagLayout jPanel2Layout = new java.awt.GridBagLayout();
        jPanel2Layout.columnWidths = new int[] {0, 0, 0, 0, 0};
        jPanel2Layout.rowHeights = new int[] {0, 5, 0};
        pnlDatos.setLayout(jPanel2Layout);

        java.awt.GridBagLayout jPanel4Layout = new java.awt.GridBagLayout();
        jPanel4Layout.columnWidths = new int[] {0, 5, 0, 5, 0};
        jPanel4Layout.rowHeights = new int[] {0, 5, 0, 5, 0, 5, 0};
        jPanel4.setLayout(jPanel4Layout);

        jLabel1.setText("Empleado:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        jPanel4.add(jLabel1, gridBagConstraints);

        txtEmpleadoSeleccionado.setEditable(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.weightx = 0.1;
        jPanel4.add(txtEmpleadoSeleccionado, gridBagConstraints);

        jLabel4.setText("Fecha de fin:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        jPanel4.add(jLabel4, gridBagConstraints);

        java.awt.GridBagLayout pnlFHInicioLayout = new java.awt.GridBagLayout();
        pnlFHInicioLayout.columnWidths = new int[] {0, 5, 0, 5, 0};
        pnlFHInicioLayout.rowHeights = new int[] {0};
        pnlFHInicio.setLayout(pnlFHInicioLayout);

        spFechaFin.setModel(new javax.swing.SpinnerDateModel());
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.weightx = 0.1;
        pnlFHInicio.add(spFechaFin, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        jPanel4.add(pnlFHInicio, gridBagConstraints);

        java.awt.GridBagLayout pnlFHInicio1Layout = new java.awt.GridBagLayout();
        pnlFHInicio1Layout.columnWidths = new int[] {0, 5, 0, 5, 0};
        pnlFHInicio1Layout.rowHeights = new int[] {0};
        pnlFHInicio1.setLayout(pnlFHInicio1Layout);

        spFechaInicio.setModel(new javax.swing.SpinnerDateModel());
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.weightx = 0.1;
        pnlFHInicio1.add(spFechaInicio, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        jPanel4.add(pnlFHInicio1, gridBagConstraints);

        jLabel7.setText("Fecha de inicio:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        jPanel4.add(jLabel7, gridBagConstraints);

        jButton1.setText("...");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 2;
        jPanel4.add(jButton1, gridBagConstraints);

        jLabel2.setText("Período:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        jPanel4.add(jLabel2, gridBagConstraints);

        cboPeriodo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        jPanel4.add(cboPeriodo, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.PAGE_START;
        gridBagConstraints.weightx = 0.2;
        gridBagConstraints.weighty = 0.1;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        pnlDatos.add(jPanel4, gridBagConstraints);

        jPanel5.setLayout(new java.awt.GridLayout(1, 0, 10, 0));

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        jPanel5.add(btnGuardar);

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        jPanel5.add(btnCancelar);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        pnlDatos.add(jPanel5, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.2;
        gridBagConstraints.weighty = 0.1;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        getContentPane().add(pnlDatos, gridBagConstraints);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        // TODO add your handling code here:
        this.accion = 0;
        this.controles(accion);
        FormularioUtil.limpiarComponente(this.pnlDatos);
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        // TODO add your handling code here:
        this.accion = Controlador.NUEVO;
        controlador.prepararCrear();
        this.controles(accion);
        integrantes.clear();
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        // TODO add your handling code here:
        int fila = tblTabla.getSelectedRow();
        if (fila != -1) {
            this.accion = Controlador.MODIFICAR;
            controlador.setSeleccionado(this.listado.get(fila));
            this.controles(accion);
            FormularioUtil.activarComponente(txtEmpleadoSeleccionado, false);
        }
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        // TODO add your handling code here:
        if (FormularioUtil.dialogoConfirmar(this, accion)) {
            Vacacion seleccionada = this.controlador.getSeleccionado();

//            FormularioUtil.convertirMayusculas(this.pnlDatos);
            seleccionada.setEmpleado(empleadoSeleccionado.getNroDocumento());
            seleccionada.setFechaInicio((Date) spFechaInicio.getValue());
            seleccionada.setFechaFin((Date) spFechaFin.getValue());
            seleccionada.setHayInterrupcion(false);

            if (controlador.accion(accion)) {
                FormularioUtil.mensajeExito(this, accion);
                this.accion = 0;
                FormularioUtil.limpiarComponente(this.pnlDatos);
                this.controles(accion);
                this.actualizarTabla();
            } else {
                FormularioUtil.mensajeError(this, accion);
            }

        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void tblTablaMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblTablaMouseReleased
        // TODO add your handling code here:
        int fila = tblTabla.getSelectedRow();
        if (fila != -1) {
            Vacacion permiso = listado.get(fila);

            mostrar(permiso);
        }
    }//GEN-LAST:event_tblTablaMouseReleased

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        DlgEmpleado dialogo = new DlgEmpleado(this);
        empleadoSeleccionado = dialogo.getSeleccionado();
        if (empleadoSeleccionado != null) {
            txtEmpleadoSeleccionado.setText(
                    empleadoSeleccionado.getApellidoPaterno()
                    + " " + empleadoSeleccionado.getApellidoMaterno()
                    + " " + empleadoSeleccionado.getNombre());
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtEmpleadoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEmpleadoKeyReleased
        // TODO add your handling code here:
        if (evt.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER) {
            lblBusqueda.setBusy(true);
            buscar();
            lblBusqueda.setBusy(false);
        }
    }//GEN-LAST:event_txtEmpleadoKeyReleased

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        DlgEmpleado dialogo = new DlgEmpleado(this);
        this.empleadoBusqueda = dialogo.getSeleccionado();
        if (this.empleadoBusqueda != null) {
            this.txtEmpleado.setText(
                    empleadoBusqueda.getNroDocumento()
                    + " " + empleadoBusqueda.getApellidoPaterno()
                    + " " + empleadoBusqueda.getApellidoMaterno()
                    + " " + empleadoBusqueda.getNombre());
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        // TODO add your handling code here:
        FormularioUtil.limpiarComponente(this.txtEmpleado);
        this.empleadoBusqueda = null;
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        // TODO add your handling code here:
        System.out.println("BUSCAR");
        lblBusqueda.setBusy(true);
        paginaActual = 1;
        buscar();
        actualizarControlesNavegacion();
        lblBusqueda.setBusy(false);
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnPrimeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrimeroActionPerformed
        // TODO add your handling code here:
        primero();
    }//GEN-LAST:event_btnPrimeroActionPerformed

    private void btnAnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnteriorActionPerformed
        // TODO add your handling code here:
        anterior();
    }//GEN-LAST:event_btnAnteriorActionPerformed

    private void spPaginaStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spPaginaStateChanged
        // TODO add your handling code here:
        this.seleccionPagina();
    }//GEN-LAST:event_spPaginaStateChanged

    private void btnSiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSiguienteActionPerformed
        // TODO add your handling code here:
        siguiente();
    }//GEN-LAST:event_btnSiguienteActionPerformed

    private void btnUltimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUltimoActionPerformed
        // TODO add your handling code here:
        ultimo();
    }//GEN-LAST:event_btnUltimoActionPerformed

    private void cboTamanioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboTamanioActionPerformed
        // TODO add your handling code here:
        this.paginaActual = 1;
        buscar();
        this.actualizarControlesNavegacion();
    }//GEN-LAST:event_cboTamanioActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        int fila = tblTabla.getSelectedRow();
        if (fila != -1) {
            Vacacion vacacion = this.listado.get(fila);
            DlgInterrupcionVacacion interrumpir = new DlgInterrupcionVacacion(this, vacacion);
            interrumpir.setVisible(true);
            this.actualizarTabla();
        }
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAnterior;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JButton btnPrimero;
    private javax.swing.JButton btnSiguiente;
    private javax.swing.JButton btnUltimo;
    private javax.swing.JComboBox cboPeriodo;
    private javax.swing.JComboBox cboTamanio;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private org.jdesktop.swingx.JXBusyLabel lblBusqueda;
    private javax.swing.JPanel pnlDatos;
    private javax.swing.JPanel pnlFHInicio;
    private javax.swing.JPanel pnlFHInicio1;
    private javax.swing.JPanel pnlListado;
    private javax.swing.JPanel pnlNavegacion;
    private javax.swing.JSpinner spFechaFin;
    private javax.swing.JSpinner spFechaFin1;
    private javax.swing.JSpinner spFechaInicio;
    private javax.swing.JSpinner spFechaInicio1;
    private javax.swing.JSpinner spPagina;
    private org.jdesktop.swingx.JXTable tblTabla;
    private javax.swing.JTextField txtEmpleado;
    private javax.swing.JTextField txtEmpleadoSeleccionado;
    private javax.swing.JTextField txtTotal;
    // End of variables declaration//GEN-END:variables

    private void mostrar(Vacacion vacacion) {
        Empleado e = ec.buscarPorId(Integer.parseInt(vacacion.getEmpleado()));
        txtEmpleadoSeleccionado.setText(e.getApellidoPaterno() + " " + e.getApellidoMaterno() + " " + e.getNombre());
        spFechaInicio.setValue(vacacion.getFechaInicio());
        spFechaFin.setValue(vacacion.getFechaFin());

    }
    
    private List<Periodo> periodoList;

    private void bindeoSalvaje() {
        listado = new ArrayList<>();
        listado = ObservableCollections.observableList(listado);
        periodoList = pc.buscarTodosOrden();

        integrantes = ObservableCollections.observableList(new ArrayList<Empleado>());

        String[] columnasIntegrantes = {"Nro Documento", "Empleado"};
        
        JComboBoxBinding bindingPeriodo  = SwingBindings.createJComboBoxBinding(AutoBinding.UpdateStrategy.READ, periodoList, cboPeriodo);

        bindingPeriodo.bind();
        
        MTAsignarVacacion mt = new MTAsignarVacacion(listado);
        MTEmpleado mtIntegrantes = new MTEmpleado(integrantes, columnasIntegrantes);
        tblTabla.setModel(mt);
        tblTabla.setModel(mtIntegrantes);

        cboPeriodo.setRenderer(new DefaultListCellRenderer(){

            @Override
            public Component getListCellRendererComponent(JList<?> list, Object value, int index, boolean isSelected, boolean cellHasFocus) {
                if(value instanceof Periodo){
                    value = ((Periodo)value).getAnio();
                }
                return super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);
            }
            
        });        
        
        actualizarTabla();
    }

    private void actualizarTabla() {
        listado.clear();
        empleadoBusqueda = null;
        FormularioUtil.limpiarComponente(txtEmpleado);
        paginaActual = 1;
        buscar();
        actualizarControlesNavegacion();
        tblTabla.packAll();
    }

    private void mostrarIntegrantes(List<String> listadoDNI) {
        integrantes.clear();
        integrantes.addAll(ec.buscarPorLista(listadoDNI));
        tblTabla.packAll();
    }

    private void inicializar() {
        this.accion = 0;

        controlador = new VacacionControlador();
        pc = new PeriodoControlador();
        FormularioUtil.modeloSpinnerFechaHora(spFechaInicio, "dd/MM/yyyy");
        FormularioUtil.modeloSpinnerFechaHora(spFechaFin, "dd/MM/yyyy");
        FormularioUtil.modeloSpinnerFechaHora(spFechaInicio1, "dd/MM/yyyy");
        FormularioUtil.modeloSpinnerFechaHora(spFechaFin1, "dd/MM/yyyy");
        this.controles(accion);
    }

    private void controles(int accion) {
        boolean bandera = accion == Controlador.NUEVO || accion == Controlador.MODIFICAR;

        FormularioUtil.activarComponente(this.pnlListado, !bandera);
        FormularioUtil.activarComponente(this.pnlDatos, bandera);

        if (accion != Controlador.MODIFICAR) {
            FormularioUtil.limpiarComponente(this.pnlDatos);

        }
    }

    private List<String> obtenerListadoDNI(List<AsignacionPermiso> detalles) {
        List<String> listadoDNI = new ArrayList<>();
        for (AsignacionPermiso detalle : detalles) {
            listadoDNI.add(detalle.getEmpleado());
        }
        return listadoDNI;
    }

//    public void agregarEmpleado(Empleado empleado) {
//        integrantes.add(empleado);
//
//        AsignacionPermiso detalle = new AsignacionPermiso();
//        detalle.setEmpleado(empleado.getNroDocumento());
//        detalle.setPermiso(controlador.getSeleccionado());
//
//        controlador.getSeleccionado().getAsignacionPermisoList().add(detalle);
//    }
//    private void quitarEmpleado(int fila) {
//        integrantes.remove(fila);
//        controlador.getSeleccionado().getAsignacionPermisoList().remove(fila);
//    }
    private int paginaActual = 1;
    private int totalPaginas = 0;
    private int tamanioPagina = 0;

    private void buscar() {
        String busqueda = txtEmpleado.getText();
        tamanioPagina = Integer.parseInt(cboTamanio.getSelectedItem().toString());

        Date fechaInicio = (Date) spFechaInicio1.getValue();
        Date fechaFin = (Date) spFechaFin1.getValue();
        listado.clear();
        List<Vacacion> lista = this.listar(empleadoBusqueda, fechaInicio, fechaFin, paginaActual, tamanioPagina);
//        System.out.println("LISTA: " + lista.size());
        listado.addAll(lista);

        tblTabla.packAll();
    }

    private List<Vacacion> listar(Empleado empleado, Date fechaInicio, Date fechaFin, int pagina, int tamanio) {
        int total;

        if (empleado == null) {
            total = controlador.contarXFecha(fechaInicio, fechaFin);
        } else {
            total = controlador.contarXEmpleadoXFecha(empleado.getNroDocumento(), fechaInicio, fechaFin);
        }

        if (total % tamanio == 0) {
            totalPaginas = total / tamanio;
        } else {
            totalPaginas = (total / tamanio) + 1;
        }

        if (totalPaginas == 0) {
            totalPaginas = 1;
        }

        if (empleado == null) {
            return controlador.buscarXFecha(fechaInicio, fechaFin, (pagina - 1) * tamanio, tamanio);
        } else {
            return controlador.buscarXEmpleadoXFecha(empleado.getNroDocumento(), fechaInicio, fechaFin, (pagina - 1) * tamanio, tamanio);
        }

    }

    private void siguiente() {
        paginaActual++;
        buscar();
        this.actualizarControlesNavegacion();
    }

    private void ultimo() {
        paginaActual = totalPaginas;
        buscar();
        this.actualizarControlesNavegacion();
    }

    private void primero() {
        paginaActual = 1;
        buscar();
        this.actualizarControlesNavegacion();
    }

    private void anterior() {
        paginaActual--;
        buscar();
        this.actualizarControlesNavegacion();
    }

    private void seleccionPagina() {
        paginaActual = (int) spPagina.getValue();
        buscar();
        this.actualizarControlesNavegacion();
    }

    private void actualizarControlesNavegacion() {
        spPagina.setValue(paginaActual);
        txtTotal.setText(totalPaginas + "");

        SpinnerNumberModel modeloSP = (SpinnerNumberModel) spPagina.getModel();
        Comparable<Integer> maximo = totalPaginas;
        modeloSP.setMaximum(maximo);

        this.btnSiguiente.setEnabled(paginaActual != totalPaginas);
        this.btnUltimo.setEnabled(paginaActual != totalPaginas);

        this.btnAnterior.setEnabled(paginaActual != 1);
        this.btnPrimero.setEnabled(paginaActual != 1);
    }
}
