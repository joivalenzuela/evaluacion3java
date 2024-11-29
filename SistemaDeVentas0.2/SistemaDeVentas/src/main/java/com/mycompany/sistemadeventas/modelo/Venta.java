/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemadeventas.modelo;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

/**
 *
 * @author jival
 */
public class Venta {
    private Cliente cliente;
    private ArrayList<Producto> carro;
    private LocalDate fecha;
    private LocalTime hora;

    public Venta() {
        fecha = LocalDate.now();
        hora  = LocalTime.now();      
    }

    public Venta(Cliente cliente) {
        this.carro = new ArrayList<Producto>();
        this.cliente = cliente;
        fecha = LocalDate.now();
        hora  = LocalTime.now();  
    }

    public Venta(Cliente cliente, ArrayList<Producto> carro) {
        this.cliente = cliente;
        this.carro = carro;
        fecha = LocalDate.now();
        hora  = LocalTime.now();  
    }   

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public ArrayList<Producto> getCarro() {
        return carro;
    }

    public void setCarro(ArrayList<Producto> carro) {
        this.carro = carro;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public LocalTime getHora() {
        return hora;
    }

    public void setHora(LocalTime hora) {
        this.hora = hora;
    }
    
}
