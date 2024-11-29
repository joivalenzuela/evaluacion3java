/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.sistemadeventas.modelo.interfaces;

import com.mycompany.sistemadeventas.modelo.Cliente;
import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author jival
 */
public interface ClienteDAO {
    
    HashMap<String,Object> agregarCliente(String run, String nombreCompleto,String correoElectronico);
    HashMap<String,Object> agregarCliente(String run, String nombreCompleto,String correoElectronico,String telefono);
    
    boolean eliminarCliente(String run);
    
    boolean editarCliente(String run, String nombreCompleto,String correoElectronico);
    boolean editarCliente(String run, String nombreCompleto,String correoElectronico, String telefono);
   
    ArrayList<Cliente> obtenerClientes();
    Cliente buscarCliente(String run);
}
