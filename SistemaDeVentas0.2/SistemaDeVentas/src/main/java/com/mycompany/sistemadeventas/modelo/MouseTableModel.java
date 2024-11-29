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
public class MouseTableModel extends AbstractTableModel {

    private List<Mouse> mouses;
    private String[] columnas={"id","Nombre","Marca","Precio","Es inalambrico?","Cantidad de botones"};
    
    public MouseTableModel(List<Mouse> mouses){
        this.mouses=mouses;
    }
    
    @Override
    public int getRowCount() {
        return mouses.size();
    }

    @Override
    public int getColumnCount() {
        return columnas.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Mouse mouse= mouses.get(rowIndex);
        switch(columnIndex){
            case 0 : return mouse.getId();
            case 1: return mouse.getNombre();
            case 2: return mouse.getMarca();
            case 3: return mouse.getPrecio();
            case 4: return mouse.isEsInalambrico();
            case 5: return mouse.getCantidadBotones();
            default: return null;
        }
    }
    
    
    @Override
    public String getColumnName(int columna){
        return columnas[columna];
    }
    
}
