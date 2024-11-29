/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemadeventas.modelo;

import com.mycompany.sistemadeventas.modelo.interfaces.VentaDAO;
import java.util.ArrayList;
import java.util.HashMap;

;
/**
 *
 * @author jival
 */
public class AdministradorVenta implements VentaDAO{
    
    ArrayList<Venta> listaVentas;

    public AdministradorVenta() {
        listaVentas = new ArrayList<>();
    }
    
    @Override
    public HashMap<String,Object> realizarVenta(Cliente c, ArrayList<Producto> p, double pago) {
        
        Venta venta = new Venta(c,p);
        HashMap<String,Object> resultadoVenta = new HashMap<>();
        double precioTotal = 0;

        ArrayList<Producto> carro = venta.getCarro();
        for(Producto producto : carro){
            precioTotal += producto.getPrecio();
        }
        if(pago<0){
            resultadoVenta.put("resultado",false);
            resultadoVenta.put("mensaje","Valor de Pago invalido");
        }else if(precioTotal == pago){
            resultadoVenta.put("resultado",true);
            resultadoVenta.put("mensaje","Venta realizada Satisfactoriamente");
            resultadoVenta.put("vuelto",0);
        }else if(precioTotal > pago){
            resultadoVenta.put("resultado",true);
            resultadoVenta.put("mensaje","Venta realizada Satisfactoriamente");
            resultadoVenta.put("vuelto",precioTotal-pago);
        }else{
            resultadoVenta.put("resultado",false);
            resultadoVenta.put("mensaje","No se pudo realizar la Venta");
        }
        if(resultadoVenta.get("resultado").equals(true)){
            listaVentas.add(venta);
        }
        return resultadoVenta;
    }

    
}
