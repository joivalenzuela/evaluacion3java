/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.sistemadeventas.modelo.interfaces;

import com.mycompany.sistemadeventas.modelo.Cliente;
import com.mycompany.sistemadeventas.modelo.Producto;
import com.mycompany.sistemadeventas.modelo.Venta;
import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author jival
 */
public interface VentaDAO {
    HashMap<String,Object> realizarVenta(Cliente c,ArrayList<Producto> p,double pago);
}
