  /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemadeventas.modelo;

import java.util.ArrayList;
import com.mycompany.sistemadeventas.modelo.interfaces.ClienteDAO;
import java.util.HashMap;

/**
 *
 * @author jival
 */
public class AdministradorCliente implements ClienteDAO{

    ArrayList<Cliente> listaClientes;

    public AdministradorCliente() {
        listaClientes = new ArrayList<>();
    }
   
    
    @Override
    public HashMap<String,Object> agregarCliente(String run, String nombreCompleto, String correoElectronico) {
        
        HashMap<String,Object> resuladoAgregar = new HashMap<String,Object>();
        
        if(run.length()!=10){
            resuladoAgregar.put("resultado", false);
            resuladoAgregar.put("texto", "El rut ingresado no es valido");
        }
        else if(!correoElectronico.contains("@")){
            resuladoAgregar.put("resultado", false);
            resuladoAgregar.put("texto", "El correo electronico ingresado no es valido");
        }
        for(Cliente c : listaClientes){
            if(c.getRun().equalsIgnoreCase(run)){
                resuladoAgregar.put("resultado", false);
                resuladoAgregar.put("texto", "El Cliente ingresado ya existe");
            }
        }

        if(!resuladoAgregar.get("resultado").equals(false)){
            
            resuladoAgregar.put("resultado", true);
            resuladoAgregar.put("texto", "Cliente agregado exitosamente");
            
            Cliente nuevoCliente = new Cliente(run,nombreCompleto,correoElectronico);
            listaClientes.add(nuevoCliente);
        }
        return resuladoAgregar;
    }
    
    @Override
     public HashMap<String,Object> agregarCliente(String run, String nombreCompleto, String correoElectronico, String telefono) {
        HashMap<String,Object> resuladoAgregar = new HashMap<>();
        
        resuladoAgregar.put("resultado", "nada");
        if(run.length()!=10){
            resuladoAgregar.put("resultado", false);
            resuladoAgregar.put("texto", "El rut ingresado no es valido");
        }
        else if(!correoElectronico.contains("@")){
            resuladoAgregar.put("resultado", false);
            resuladoAgregar.put("texto", "El correo electronico ingresado no es valido");
        }
        for(Cliente c : listaClientes){
            if(c.getRun().equalsIgnoreCase(run)){
                resuladoAgregar.put("resultado", false);
                resuladoAgregar.put("texto", "El Cliente ingresado ya existe");
            }
        }

        if(resuladoAgregar.get("resultado").equals("nada")){
            
            resuladoAgregar.put("resultado", true);
            resuladoAgregar.put("texto", "Cliente agregado exitosamente");
            
            Cliente nuevoCliente = new Cliente(run,nombreCompleto,correoElectronico);
            nuevoCliente.setTelefono(telefono);
            listaClientes.add(nuevoCliente);
        }
        return resuladoAgregar;
    }
    
    
    @Override
    public boolean eliminarCliente(String run) {
       for(Cliente c : listaClientes){
            if(c.getRun().equalsIgnoreCase(run)){
                listaClientes.remove(c);
                return true;
            }
        }
       return false;
    }

    @Override
    public boolean editarCliente(String run, String nombreCompleto, String correoElectronico) {
        for(Cliente c : listaClientes){
            if(c.getRun().equalsIgnoreCase(run)){
               c.setNombreCompleto(nombreCompleto);
               c.setNombreCompleto(nombreCompleto);
               return true;
            }
        }
        return false;
    }
    
    @Override
    public boolean editarCliente(String run, String nombreCompleto, String correoElectronico, String telefono) {
         for(Cliente c : listaClientes){
            if(c.getRun().equalsIgnoreCase(run)){
               c.setNombreCompleto(nombreCompleto);
               c.setNombreCompleto(nombreCompleto);
               c.setTelefono(telefono);
               return true;
            }
        }
        return false;
    }
    

    @Override
    public ArrayList<Cliente> obtenerClientes() {
        return listaClientes;
    }

    @Override
    public Cliente buscarCliente(String run) {
        for(Cliente c : listaClientes){
           if(c.getRun().equalsIgnoreCase(run)){
              return c;
           }
           
        }
        return null;
    }

}    

