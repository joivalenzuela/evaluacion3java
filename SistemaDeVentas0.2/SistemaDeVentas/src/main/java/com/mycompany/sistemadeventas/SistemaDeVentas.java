/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.sistemadeventas;

import com.mycompany.sistemadeventas.controlador.ControladorCliente;
import com.mycompany.sistemadeventas.controlador.ControladorMain;
import com.mycompany.sistemadeventas.vista.FrameCliente;
import com.mycompany.sistemadeventas.vista.MainFrame;

/**
 *
 * @author jival
 */
public class SistemaDeVentas {

    public static void main(String[] args) {
        MainFrame mainFrame= new MainFrame();
        mainFrame.setVisible(true);
        mainFrame.setLocationRelativeTo(null);
        ControladorMain mainFrameController= new ControladorMain(mainFrame);
        
    }
    
}
