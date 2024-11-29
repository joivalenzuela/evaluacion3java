/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemadeventas.modelo;

import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author jival
 */
public class ClienteTableModel extends AbstractTableModel {

    private List<Cliente> clientes;
    private String[] columnas={"Rut","Nombre","Email","Telefono"};
    
    public ClienteTableModel(List<Cliente> clientes){
        this.clientes=clientes;
    }
    
    @Override
    public int getRowCount() {
        return clientes.size();
    }

    @Override
    public int getColumnCount() {
        return columnas.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Cliente cliente= clientes.get(rowIndex);
        switch(columnIndex){
            case 0 : return cliente.getRun();
            case 1: return cliente.getNombreCompleto();
            case 2: return cliente.getCorreoElectronico();
            case 3: return cliente.getTelefono();
            default: return null;
        }
    }
    
    
    @Override
    public String getColumnName(int columna){
        return columnas[columna];
    }
    
}
