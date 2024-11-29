/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemadeventas.controlador;

import com.mycompany.sistemadeventas.vista.FrameCliente;
import com.mycompany.sistemadeventas.vista.MainFrame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Alvaro
 */
public class ControladorMain {
    private MainFrame vistaPrincipal;
    private FrameCliente vistaCliente;

    public ControladorMain(MainFrame vistaPrincipal) {
        this.vistaPrincipal = vistaPrincipal;
       
        agregarListeners();
        
        
    }
    
    private void agregarListeners(){
       
        vistaPrincipal.getBtnCliente2().addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                
                FrameCliente frameCliente = new FrameCliente();
                frameCliente.setVisible(true);
                ControladorCliente clienteControlador = new ControladorCliente(frameCliente);
            }
        });
    }
}
                   
 
        