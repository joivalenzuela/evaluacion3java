/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemadeventas.modelo;

/**
 *
 * @author jival
 */
public class Mouse extends Producto {
    private int cantidadBotones;

    public Mouse() {
    }

    public Mouse(int cantidadBotones) {
        this.cantidadBotones = cantidadBotones;
    }

    public Mouse(String id, String nombre, String marca, double precio, boolean esInalambrico) {
        super(id, nombre, marca, precio, esInalambrico);
    }

    public Mouse(int cantidadBotones, String id, String nombre, String marca, double precio, boolean esInalambrico) {
        super(id, nombre, marca, precio, esInalambrico);
        this.cantidadBotones = cantidadBotones;
    }

    public int getCantidadBotones() {
        return cantidadBotones;
    }

    public void setCantidadBotones(int cantidadBotones) {
        this.cantidadBotones = cantidadBotones;
    }

    
    @Override
    public String obtenerDatos() {
        return String.format("DATOS:\nID=%s\nNOMBRE=%s\nMARCA=%s\nPRECIO=%f\nES_INALAMBRICO=%b\nCANTIDAD_BOTONES=%d",
                id, nombre, marca, precio, esInalambrico, cantidadBotones);
    }
    
    
}
