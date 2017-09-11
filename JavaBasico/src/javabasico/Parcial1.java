/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javabasico;

import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author ESTUDIANTE
 */
public class Parcial1 {
    
    public static void main(String[] args) {
        /* 1)determinar el valor de  un pasaje en avionl, conociendo la distancia a recorrer, el numero de dias de estancia y sabiendo
        que si la distancia a recorrer es superior a 1000 KM y el numero de dias en la estancia es superior a 7,
        la linea aerea le hace un descuento del 30%
        precio por KM es de $ 35*/
        
        
        float distancia=0 ,dias=0,km=35, pasaje=0, descuento=0;
        distancia=Float.parseFloat(JOptionPane.showInputDialog("Digite la distancia en (KM)"));
        dias= Float.parseFloat(JOptionPane.showInputDialog("Digite el numero de dias"));
        pasaje = distancia*km;
        if (distancia >1000 && dias > 7)
        {
            descuento= (float) (pasaje * 0.3) ;
        }
        System.out.println("pasaje: $"+(pasaje-descuento)+ " descuento: $"+descuento );
        
    }
}
