/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemadeventas.modelo;

import com.mycompany.sistemadeventas.modelo.interfaces.ProductoDAO;
import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author jival
 */
public class AdministradorProducto implements ProductoDAO{
    ArrayList<Producto> listaProductos;

    @Override
    public HashMap<String,Object> registrarProducto(Producto p) {
        HashMap<String,Object> resultadoRegistrar = new HashMap<>();
        if(p instanceof Mouse m){
            if(m.getCantidadBotones()<2){
                resultadoRegistrar.put("resultado",false);
                resultadoRegistrar.put("texto","Los mouse deben tener por lo menos 2 botones");
                resultadoRegistrar.put("tipo","mouse");
            }else{
                resultadoRegistrar.put("resultado",true);
                resultadoRegistrar.put("texto","Producto Registrado Correctamente");
                resultadoRegistrar.put("tipo","mouse");
                
                listaProductos.add(m);
            }
        }else if(p instanceof Audifonos a){
            //TODO AGREGAR MAS RESTRICCIONES
            //TODO RESULTADOS HASHMAP
            listaProductos.add(a);
        }
        return resultadoRegistrar;
    }

    @Override
    public ArrayList<Producto> obtenerProductos() {
        return listaProductos;
    }

    @Override
    public Producto buscarProducto(String id) {
        for(Producto p : listaProductos){
            if(p.getId().equalsIgnoreCase(id)){
               return p;
            }
        }
        return null;
    }

   
    
}
