/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.sistemadeventas.modelo.interfaces;

/**
 *
 * @author jival
 */
public interface ReporteDAO {
    void crearReporte(String codigoProducto,String nombreProducto,String nombreCliente,String correoCliente,double PrecioVenta);
    void listarReportes();
    int cantidadVentas();
    double montoTotal();
    
}
