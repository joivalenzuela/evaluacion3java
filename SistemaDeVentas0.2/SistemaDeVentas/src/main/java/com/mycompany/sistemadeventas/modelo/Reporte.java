/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemadeventas.modelo;

/**
 *
 * @author jival
 */
public class Reporte {
    private String codigoProducto;
    private String nombreProducto;
    private String nombreCliente;
    private String correoCliente;
    private double PrecioVenta;

    public Reporte(String codigoProducto, String nombreProducto, String nombreCliente, String correoCliente, double PrecioVenta) {
        this.codigoProducto = codigoProducto;
        this.nombreProducto = nombreProducto;
        this.nombreCliente = nombreCliente;
        this.correoCliente = correoCliente;
        this.PrecioVenta = PrecioVenta;
    }

    public String getCodigoProducto() {
        return codigoProducto;
    }

    public void setCodigoProducto(String codigoProducto) {
        this.codigoProducto = codigoProducto;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getCorreoCliente() {
        return correoCliente;
    }

    public void setCorreoCliente(String correoCliente) {
        this.correoCliente = correoCliente;
    }

    public double getPrecioVenta() {
        return PrecioVenta;
    }

    public void setPrecioVenta(double PrecioVenta) {
        this.PrecioVenta = PrecioVenta;
    }
    
    
    
    
    
}
