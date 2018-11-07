/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eayo.vista;

import com.eayo.modelo.Punto;
import javax.swing.JOptionPane;

/**
 *
 * @author DELL
 */
public class Aplicacion {
    public static void main(String[] args) {
        int a,b;
      
        
        int op;
        do {            
            op=Integer.parseInt(JOptionPane.showInputDialog("Deseas Ingresar un Punto: \n"
            + "1.- Si \n"
            + "2.- No"));
            
            if (op==1) {
                a= Integer.parseInt(JOptionPane.showInputDialog("Ingrese  X: "));
                b= Integer.parseInt(JOptionPane.showInputDialog("Ingrese  Y: "));
                Punto.almacenarPuntos(a, b);  
             
            }
  
            
        
        } while (op != 2);
        
        
        Punto.imprimirPuntos();
             
//        JOptionPane.showMessageDialog(null,p1.toString()+ "\n"+ p2.toString() + "\n"+
//                "La distancia es: "+ Punto.calcularDistancia(p1, p2));

        
        
    }
    
}