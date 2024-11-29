/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemadeventas.modelo;

import com.mycompany.sistemadeventas.modelo.interfaces.ReporteDAO;
import java.util.ArrayList;

/**
 *
 * @author jival
 */
public class AdministradorReporte implements ReporteDAO{

    private ArrayList<Reporte> listaReportes;
    
    
    
    public AdministradorReporte() {
        listaReportes = new ArrayList<>();
    }
    
    @Override
    public void crearReporte(String codigoProducto, String nombreProducto, String nombreCliente, String correoCliente, double PrecioVenta) {
        listaReportes.add(new Reporte(codigoProducto, nombreProducto, nombreCliente, correoCliente, PrecioVenta));
    }
    
    
    @Override
    public void listarReportes() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int cantidadVentas() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public double montoTotal() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    
    
          
}
