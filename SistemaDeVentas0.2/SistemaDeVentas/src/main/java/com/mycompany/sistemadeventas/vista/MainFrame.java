/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.sistemadeventas.vista;

import javax.swing.JButton;
import javax.swing.JMenu;
import javax.swing.JMenuBar;

/**
 *
 * @author jival
 */
public class MainFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainFrame
     */
    public MainFrame() {
        initComponents();
    }
    public JButton getBtnCliente2() {
        return btnCliente;
    }

    public void setBtnCliente2(JButton btnCliente2) {
        this.btnCliente = btnCliente2;
    }

    public JButton getBtnCliente() {
        return btnCliente;
    }

    public void setBtnCliente(JButton btnCliente) {
        this.btnCliente = btnCliente;
    }

    public JButton getBtnProducto() {
        return btnProducto;
    }

    public void setBtnProducto(JButton btnProducto) {
        this.btnProducto = btnProducto;
    }

    public JButton getBtnReporte() {
        return btnReporte;
    }

    public void setBtnReporte(JButton btnReporte) {
        this.btnReporte = btnReporte;
    }

    public JButton getBtnVenta() {
        return btnVenta;
    }

    public void setBtnVenta(JButton btnVenta) {
        this.btnVenta = btnVenta;
    }

    public JMenuBar getjMenuBar2() {
        return jMenuBar2;
    }

    public void setjMenuBar2(JMenuBar jMenuBar2) {
        this.jMenuBar2 = jMenuBar2;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnCliente = new javax.swing.JButton();
        btnProducto = new javax.swing.JButton();
        btnVenta = new javax.swing.JButton();
        btnReporte = new javax.swing.JButton();
        jMenuBar2 = new javax.swing.JMenuBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnCliente.setText("Cliente");
        btnCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClienteActionPerformed(evt);
            }
        });

        btnProducto.setText("Producto");

        btnVenta.setText("Venta");

        btnReporte.setText("Reporte");
        setJMenuBar(jMenuBar2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(btnCliente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnProducto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnVenta)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnReporte)
                .addGap(0, 87, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCliente)
                    .addComponent(btnProducto)
                    .addComponent(btnVenta)
                    .addComponent(btnReporte))
                .addGap(0, 276, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnClienteActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCliente;
    private javax.swing.JButton btnProducto;
    private javax.swing.JButton btnReporte;
    private javax.swing.JButton btnVenta;
    private javax.swing.JMenuBar jMenuBar2;
    // End of variables declaration//GEN-END:variables
}