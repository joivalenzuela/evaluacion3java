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
public class AudifonosTableModel extends AbstractTableModel {

    private List<Audifonos> liAudifonos;
    private String[] columnas={"id","Nombre","Marca","Precio","Es inalambrico?","Microfono Incluido?"};
    
    public AudifonosTableModel(List<Audifonos> liAudifonos){
        this.liAudifonos=liAudifonos;
    }
    
    @Override
    public int getRowCount() {
        return liAudifonos.size();
    }

    @Override
    public int getColumnCount() {
        return columnas.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Audifonos audifono= liAudifonos.get(rowIndex);
        switch(columnIndex){
            case 0 : return audifono.getId();
            case 1: return audifono.getNombre();
            case 2: return audifono.getMarca();
            case 3: return audifono.getPrecio();
            case 4: return audifono.isEsInalambrico();
            case 5: return audifono.isMicrofonoIncluido();
            default: return null;
        }
    }
    
    
    @Override
    public String getColumnName(int columna){
        return columnas[columna];
    }
    
}
