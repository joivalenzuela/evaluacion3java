/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemadeventas.modelo;

/**
 *
 * @author jival
 */
public abstract class Producto {
    protected String id;
    protected String nombre;
    protected String marca;
    protected double precio;
    protected boolean esInalambrico;
  
    public Producto() {
    }

    public Producto(String id, String nombre, String marca, double precio, boolean esInalambrico) {
        this.id = id;
        this.nombre = nombre;
        this.marca = marca;
        this.precio = precio;
        this.esInalambrico = esInalambrico;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public boolean isEsInalambrico() {
        return esInalambrico;
    }

    public void setEsInalambrico(boolean esInalambrico) {
        this.esInalambrico = esInalambrico;
    }
    
    public abstract String obtenerDatos();
        
    
    
}
