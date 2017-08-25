/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javabasico;

import java.util.Random;

/**
 *
 * @author usuario
 */
public class Taller3 {
    public static void main(String[] args) {
        int dado1=0,dado2=0, suma=0;
        int [] vi = new int[12];
        Random r = new Random();
        for(int i =0 ; i<1000000; i++)
        {
           dado1 = r.nextInt(6)+1;
           dado2 = r.nextInt(6)+1;
           suma=dado1+ dado2;
           vi[suma-1]+=1;
        }
        for(int i=0; i<vi.length; i++)
        {
            System.out.println("Posicion: "+(i+1)+" valor: "+vi[i]);
        }
        
        int aux=vi[1],pos=0;
        for(int i=0;i<vi.length;i++)
        {
            for(int j=1;j<vi.length;j++)
            {
                if(vi[i]>aux)
                {
                    aux=vi[i];
                    pos=i+1;
                }
            }
            
        }
        System.out.println("Posicion mayor: "+pos+" valor mayor: "+aux);
        
    }
}
