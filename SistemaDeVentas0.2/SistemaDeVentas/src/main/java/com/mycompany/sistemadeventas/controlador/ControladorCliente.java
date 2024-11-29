/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemadeventas.controlador;

import com.mycompany.sistemadeventas.modelo.AdministradorCliente;
import com.mycompany.sistemadeventas.modelo.Cliente;
import com.mycompany.sistemadeventas.modelo.ClienteTableModel;
import com.mycompany.sistemadeventas.modelo.interfaces.ClienteDAO;
import com.mycompany.sistemadeventas.vista.FrameCliente;
import com.mycompany.sistemadeventas.vista.MainFrame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

/**
 *
 * @author jival
 */
public class ControladorCliente {
    private FrameCliente vistaCliente;
    private ClienteDAO clienteDao;

    public ControladorCliente(FrameCliente vistaCliente) {
        this.vistaCliente = vistaCliente;
        clienteDao= new AdministradorCliente();
        agregarListeners();
    }
    private void agregarListeners(){
        //falta configurar el listener para el boton eliminar. En esta accion se debe ocupar el metodo "eliminarCliente" que existe en el administrador del cliente. Deberán hacerlo ustedes guiandose con los otros ejemplos que existen más abajo en esta clase.
        //esto lo haran ejecutando "clienteDao.eliminarCliente(String rut)".
        vistaCliente.getBtnAgregar().addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                
                String nombre= vistaCliente.getTxtNombreCompleto().getText();
                String rut= vistaCliente.getTxtRut().getText();
                String email= vistaCliente.getTxtEmail().getText();
                String telefono= vistaCliente.getTxtTelefono().getText();
                HashMap <String,Object> respuesta=clienteDao.agregarCliente(rut, nombre, email, telefono);
                
                
                
                //en caso de que todo funcione bien el administrador de clientes devolvera 400 al momento de crear un cliente
                if((boolean)respuesta.get("resultado")){
                    vistaCliente.actualizarInfoUsuario("El cliente ha sido creado exitosamente");
                    ClienteTableModel modeloTablaCliente= new ClienteTableModel(clienteDao.obtenerClientes());
                    vistaCliente.actualizarTablaClientes(modeloTablaCliente);
                    vistaCliente.getTxtNombreCompleto().setText("");
                    vistaCliente.getTxtRut().setText("");
                    vistaCliente.getTxtEmail().setText("");
                    vistaCliente.getTxtTelefono().setText("");
                }else{
                    vistaCliente.actualizarInfoUsuario((String)respuesta.get("texto"));
                }
                
            }
            
        });
        vistaCliente.getBtnEditar().addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                String nombre= vistaCliente.getTxtNombreCompleto().getText();
                String rut= vistaCliente.getTxtRut().getText();
                String email= vistaCliente.getTxtEmail().getText();
                String telefono= vistaCliente.getTxtTelefono().getText();
                Boolean respuesta=clienteDao.editarCliente(rut, nombre, email, telefono);
                if(respuesta){
                vistaCliente.actualizarInfoUsuario("Editado Correctamente.");
                }else{
                    vistaCliente.actualizarInfoUsuario("No se pudo editar.");
                }
                ClienteTableModel modeloTablaCliente= new ClienteTableModel(clienteDao.obtenerClientes());
                vistaCliente.actualizarTablaClientes(modeloTablaCliente);
                
            }
                
            
            
        });
        
        vistaCliente.getBtnBuscar().addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
              
                String rut= vistaCliente.getTxtRut().getText();
                
                Cliente cliente=clienteDao.buscarCliente(rut);
                
                if(cliente!=null){
                
                vistaCliente.actualizarInfoUsuario("Cliente Encontrado");
                vistaCliente.getTxtNombreCompleto().setText(cliente.getNombreCompleto());
                vistaCliente.getTxtEmail().setText(cliente.getCorreoElectronico());
                vistaCliente.getTxtTelefono().setText(cliente.getTelefono());
                
                }else{
                    vistaCliente.actualizarInfoUsuario("El cliente no fue encontrado");
                }
            
            }
                
            
            
        });
        
        
    }
    }
