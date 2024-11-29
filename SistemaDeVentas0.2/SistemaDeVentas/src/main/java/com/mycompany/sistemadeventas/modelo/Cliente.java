/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemadeventas.modelo;

/**
 *
 * @author jival
 */
public class Cliente {
    private String run;
    private String nombreCompleto;
    private String correoElectronico;
    private String telefono;
    
    public Cliente() {
    }

    public Cliente(String run, String nombreCompleto,String correoElectronico) {
        this.run = run;
        this.nombreCompleto = nombreCompleto;
        this.correoElectronico = correoElectronico;
    }

    public Cliente(String run, String nombreCompleto, String correoElectronico, String telefono) {
        this.run = run;
        this.nombreCompleto = nombreCompleto;
        this.correoElectronico = correoElectronico;
        this.telefono = telefono;
    }
    
    
    
    public String getRun() {
        return run;
    }

    public void setRun(String run) {
        this.run = run;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }
    
}
