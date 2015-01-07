/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biz.juvitec.vistas;

/**
 *
 * @author fesquivelc
 */
public class VistaRegistroAsistencia extends javax.swing.JInternalFrame {

    /**
     * Creates new form RegistroAsistencia
     */
    public VistaRegistroAsistencia() {
        initComponents();
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

        jPanel1 = new javax.swing.JPanel();
        pnlRegistroDetalleMarcaciones = new javax.swing.JPanel();
        pnlRegistro = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jXTable1 = new org.jdesktop.swingx.JXTable();
        pnlDetalle = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jXTable5 = new org.jdesktop.swingx.JXTable();
        pnlMarcaciones = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jXTable4 = new org.jdesktop.swingx.JXTable();
        jPanel3 = new javax.swing.JPanel();
        spFechaInicio = new javax.swing.JSpinner();
        jLabel3 = new javax.swing.JLabel();
        spFechaFin = new javax.swing.JSpinner();
        jLabel4 = new javax.swing.JLabel();
        cboArea = new javax.swing.JComboBox();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        txtEmpleado = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        pnlHorarioResumen = new javax.swing.JPanel();
        pnlHorario = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jXTable2 = new org.jdesktop.swingx.JXTable();
        pnlResumen = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jXTable3 = new org.jdesktop.swingx.JXTable();

        setClosable(true);
        setIconifiable(true);
        setTitle("REGISTRO DE ASISTENCIA");
        setToolTipText("Aquí se muestran todas las asistencias de los empleados");
        getContentPane().setLayout(new java.awt.GridBagLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("REGISTRO DE ASISTENCIA"));
        java.awt.GridBagLayout jPanel1Layout = new java.awt.GridBagLayout();
        jPanel1Layout.columnWidths = new int[] {0, 5, 0};
        jPanel1Layout.rowHeights = new int[] {0, 5, 0};
        jPanel1.setLayout(jPanel1Layout);

        java.awt.GridBagLayout pnlRegistroDetalleMarcacionesLayout = new java.awt.GridBagLayout();
        pnlRegistroDetalleMarcacionesLayout.columnWidths = new int[] {0, 10, 0};
        pnlRegistroDetalleMarcacionesLayout.rowHeights = new int[] {0, 10, 0};
        pnlRegistroDetalleMarcaciones.setLayout(pnlRegistroDetalleMarcacionesLayout);

        pnlRegistro.setBorder(javax.swing.BorderFactory.createTitledBorder("Listado de asistencia"));
        pnlRegistro.setLayout(new java.awt.GridBagLayout());

        jXTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jXTable1);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 21;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.weighty = 0.1;
        pnlRegistro.add(jScrollPane1, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.2;
        gridBagConstraints.weighty = 0.3;
        pnlRegistroDetalleMarcaciones.add(pnlRegistro, gridBagConstraints);

        pnlDetalle.setBorder(javax.swing.BorderFactory.createTitledBorder("Detalle de la asistencia"));
        pnlDetalle.setLayout(new java.awt.GridLayout());

        jXTable5.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane5.setViewportView(jXTable5);

        pnlDetalle.add(jScrollPane5);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.weighty = 0.1;
        pnlRegistroDetalleMarcaciones.add(pnlDetalle, gridBagConstraints);

        pnlMarcaciones.setBorder(javax.swing.BorderFactory.createTitledBorder("Marcaciones en el día"));
        pnlMarcaciones.setLayout(new java.awt.GridLayout());

        jXTable4.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane4.setViewportView(jXTable4);

        pnlMarcaciones.add(jScrollPane4);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.weighty = 0.1;
        pnlRegistroDetalleMarcaciones.add(pnlMarcaciones, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.2;
        gridBagConstraints.weighty = 0.1;
        jPanel1.add(pnlRegistroDetalleMarcaciones, gridBagConstraints);

        java.awt.GridBagLayout jPanel3Layout = new java.awt.GridBagLayout();
        jPanel3Layout.columnWidths = new int[] {0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0};
        jPanel3Layout.rowHeights = new int[] {0};
        jPanel3.setLayout(jPanel3Layout);

        spFechaInicio.setModel(new javax.swing.SpinnerDateModel());
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 14;
        gridBagConstraints.gridy = 0;
        jPanel3.add(spFechaInicio, gridBagConstraints);

        jLabel3.setText("FECHAS:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 12;
        gridBagConstraints.gridy = 0;
        jPanel3.add(jLabel3, gridBagConstraints);

        spFechaFin.setModel(new javax.swing.SpinnerDateModel());
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 18;
        gridBagConstraints.gridy = 0;
        jPanel3.add(spFechaFin, gridBagConstraints);

        jLabel4.setText("-");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 16;
        gridBagConstraints.gridy = 0;
        jPanel3.add(jLabel4, gridBagConstraints);

        cboArea.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 8;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 0.1;
        jPanel3.add(cboArea, gridBagConstraints);

        jButton2.setText("...");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 0;
        jPanel3.add(jButton2, gridBagConstraints);

        jLabel2.setText("ÁREA:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 0;
        jPanel3.add(jLabel2, gridBagConstraints);

        jButton1.setText("LIMPIAR");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 10;
        gridBagConstraints.gridy = 0;
        jPanel3.add(jButton1, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 0.1;
        jPanel3.add(txtEmpleado, gridBagConstraints);

        jLabel1.setText("EMPLEADO:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        jPanel3.add(jLabel1, gridBagConstraints);

        jButton3.setText("Buscar");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 20;
        gridBagConstraints.gridy = 0;
        jPanel3.add(jButton3, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        jPanel1.add(jPanel3, gridBagConstraints);

        java.awt.GridBagLayout pnlHorarioResumenLayout = new java.awt.GridBagLayout();
        pnlHorarioResumenLayout.columnWidths = new int[] {0};
        pnlHorarioResumenLayout.rowHeights = new int[] {0, 10, 0};
        pnlHorarioResumen.setLayout(pnlHorarioResumenLayout);

        pnlHorario.setBorder(javax.swing.BorderFactory.createTitledBorder("Detalle del horario"));
        pnlHorario.setLayout(new java.awt.GridLayout());

        jXTable2.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(jXTable2);

        pnlHorario.add(jScrollPane2);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.weighty = 0.1;
        pnlHorarioResumen.add(pnlHorario, gridBagConstraints);

        pnlResumen.setBorder(javax.swing.BorderFactory.createTitledBorder("Resúmen (Solo para un empleado)"));
        pnlResumen.setLayout(new java.awt.GridLayout());

        jXTable3.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane3.setViewportView(jXTable3);

        pnlResumen.add(jScrollPane3);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.weighty = 0.1;
        pnlHorarioResumen.add(pnlResumen, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.weighty = 0.1;
        jPanel1.add(pnlHorarioResumen, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.weighty = 0.1;
        getContentPane().add(jPanel1, gridBagConstraints);

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox cboArea;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private org.jdesktop.swingx.JXTable jXTable1;
    private org.jdesktop.swingx.JXTable jXTable2;
    private org.jdesktop.swingx.JXTable jXTable3;
    private org.jdesktop.swingx.JXTable jXTable4;
    private org.jdesktop.swingx.JXTable jXTable5;
    private javax.swing.JPanel pnlDetalle;
    private javax.swing.JPanel pnlHorario;
    private javax.swing.JPanel pnlHorarioResumen;
    private javax.swing.JPanel pnlMarcaciones;
    private javax.swing.JPanel pnlRegistro;
    private javax.swing.JPanel pnlRegistroDetalleMarcaciones;
    private javax.swing.JPanel pnlResumen;
    private javax.swing.JSpinner spFechaFin;
    private javax.swing.JSpinner spFechaInicio;
    private javax.swing.JTextField txtEmpleado;
    // End of variables declaration//GEN-END:variables
}
