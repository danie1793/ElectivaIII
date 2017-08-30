/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javabasico;
import java.util.Arrays;
/**
 *
 * @author ESTUDIANTE
 */
public class Vector {
     public static void main(String[] args) {
        int [] numeros={15,18,95,35,2,8,130,31,9,12};
        Arrays.sort(numeros);
        for(int n:numeros)
        {
            System.out.print(n+", ");
        }
        System.out.println("\n ");
        
        int [] num2 = new int[8];
        Arrays.fill(num2, 35);
        for(int n:num2)
        {
            System.out.print(n+", ");
        }
        System.out.println("\n ");
        
        int[] num3 = new int[num2.length];
        boolean vb=Arrays.equals(num2, num3);
        System.out.println("iguales: "+ vb);
        
        int pos= Arrays.binarySearch(num2, 35);
        if(pos>=0)
        {
            System.out.println("se encuentra en la posicion: "+ pos);
        }
        else{System.out.println("se encuentra en el vector");}
        
        
    }
    



    
}
