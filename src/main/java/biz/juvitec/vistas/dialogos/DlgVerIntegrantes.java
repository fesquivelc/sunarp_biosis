/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biz.juvitec.vistas.dialogos;

import biz.juvitec.controladores.DetalleGrupoControlador;
import biz.juvitec.controladores.EmpleadoControlador;
import biz.juvitec.entidades.AsignacionHorario;
import biz.juvitec.entidades.DetalleGrupoHorario;
import biz.juvitec.entidades.Empleado;
import biz.juvitec.entidades.GrupoHorario;
import biz.juvitec.vistas.modelos.MTEmpleado;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author fesquivelc
 */
public class DlgVerIntegrantes extends javax.swing.JDialog {

    /**
     * Creates new form DlgVerIntegrantes
     */
    private final GrupoHorario grupoSeleccionado;
    private final DetalleGrupoControlador ahc;
    private final EmpleadoControlador ec;

    public DlgVerIntegrantes(JInternalFrame padre, GrupoHorario grupo) {
        super(JOptionPane.getFrameForComponent(padre), true);
        initComponents();
        this.grupoSeleccionado = grupo;
        this.ec = new EmpleadoControlador();
        ahc = new DetalleGrupoControlador();
        bindeoSalvaje();
        this.setTitle("INTEGRANTES DEL GRUPO "+grupo.getNombre());
        this.setLocationRelativeTo(padre);
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
        jScrollPane1 = new javax.swing.JScrollPane();
        tblTabla = new org.jdesktop.swingx.JXTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new java.awt.GridBagLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Integrantes del grupo"));
        jPanel1.setLayout(new java.awt.GridLayout());

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
        jScrollPane1.setViewportView(tblTabla);

        jPanel1.add(jScrollPane1);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.weighty = 0.1;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        getContentPane().add(jPanel1, gridBagConstraints);

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private org.jdesktop.swingx.JXTable tblTabla;
    // End of variables declaration//GEN-END:variables

    private void bindeoSalvaje() {
        List<String> empleadosDNI = this.dnis(this.ahc.buscarXGrupo(grupoSeleccionado));
        List<Empleado> empleados = ec.buscarPorLista(empleadosDNI);
        MTEmpleado mt = new MTEmpleado(empleados);
        tblTabla.setModel(mt);
    }

    private List<String> dnis(List<DetalleGrupoHorario> asignaciones) {
        List<String> listado = new ArrayList<>();
        for (DetalleGrupoHorario asignacion : asignaciones) {
            listado.add(asignacion.getEmpleado());
        }
        return listado;
    }
}
