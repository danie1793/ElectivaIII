/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javabasico;

import javax.swing.JOptionPane;

/**
 *
 * @author ESTUDIANTE
 */
public class Taller2 {
     public static void main(String[] args) {
     int valor,dec;
     int [] vector = new int[5];
     String x;
     
     valor=Integer.parseInt(JOptionPane.showInputDialog("digite un numero de 5 digitos: "));
     x=Integer.toString(valor);
     if(x.length()==5)
     {
         for(int i=4; i>=0;i--)
         {
             vector[i]=valor%10;
             valor=valor/10;
         }
         for(int i =0; i<=4; i++)
         {
             if(vector[i]>vector[i+1]){System.out.println("el Numero esta mal");}
             //System.out.println("posicion["+i+"] "+vector[i]);
         }
         
     }
     else {System.out.println("pal perro");}
     }
}
