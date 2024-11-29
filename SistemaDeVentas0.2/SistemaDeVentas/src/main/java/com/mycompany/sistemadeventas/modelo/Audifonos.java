/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemadeventas.modelo;

/**
 *
 * @author jival
 */
public class Audifonos extends Producto{
    private boolean microfonoIncluido;

    public Audifonos() {
    }

    public Audifonos(boolean microfonoIncluido, String id, String nombre, String marca, double precio, boolean esInalambrico) {
        super(id, nombre, marca, precio, esInalambrico);
        this.microfonoIncluido = microfonoIncluido;
    }

    public boolean isMicrofonoIncluido() {
        return microfonoIncluido;
    }

    public void setMicrofonoIncluido(boolean microfonoIncluido) {
        this.microfonoIncluido = microfonoIncluido;
    }

   @Override
    public String obtenerDatos() {
        return String.format("DATOS:\nID=%s\nNOMBRE=%s\nMARCA=%s\nPRECIO=%f\nES_INALAMBRICO=%b\nCANTIDAD_BOTONES=%b",
                id, nombre, marca, precio, esInalambrico, microfonoIncluido);
    }
}
