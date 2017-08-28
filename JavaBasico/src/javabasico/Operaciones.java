/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javabasico;

import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ESTUDIANTE
 */
public class Operaciones {

    public static void main(String[] args) {
        int vInt;
        float vFloat;
        String vStr;
        boolean b1, b2;
        Scanner vscan = new Scanner(System.in);

        vInt = 5 + 2;
        System.out.println("5+2 : " + vInt);
        vInt = 5 - 2;
        System.out.println("5-2 : " + vInt);
        vInt = 5 * 2;
        System.out.println("5*2 : " + vInt);
        vInt = 5 % 2;
        System.out.println("5%2 : " + vInt);
        vInt = 5 ^ 2;
        System.out.println("5^2 : " + vInt);
        System.out.println("\n");

        vFloat = 5 + 2;
        System.out.println("5+2 : " + vFloat);
        vFloat = 5 - 2;
        System.out.println("5-2 : " + vFloat);
        vFloat = 5 * 2;
        System.out.println("5*2 : " + vFloat);
        vFloat = 5 % 2;
        System.out.println("5%2 : " + vFloat);
        vFloat = 5 ^ 2;
        System.out.println("5^2 : " + vFloat);
        System.out.println("\n");

        /*vStr = "David ";
         vStr += "William";
         System.out.println("Cadena: "+ vStr);
         System.out.println("\n");*/
        b1 = true;
        b2 = false;
        System.out.println("&&: " + (b1 && b2));
        System.out.println("||: " + (b1 || b2));
        System.out.println("¬b1: " + (!b1));
        System.out.println("¬b2: " + (!b2));
        System.out.println("\n");

        System.out.println("texto: ");
        //System.out.println(vscan.nextLine());
        System.out.println("\n");

        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }
        System.out.println("\n");

        int a = 32, b;

        System.out.println(a);
        b = a << 2;
        System.out.println(b);
        b = a >> 2;
        System.out.println(b);
        b = a & 2;
        System.out.println(b);

        for (int i = 0; i < 5; i++) {
            if (i == 3) {
                continue;
            }
            System.out.println("Ciclo: " + i);

        }
        byte cos = 2, cas = 2;
        while (cos < 10) {
            System.out.println("while: " + cos);
            cos += 2;
        }

        do {
            System.out.println("do while: " + cas);
            cas += 2;
        } while (cas < 10);
        
        if(cas<=8)
        {
            System.out.println("si menor que 8: " + cas);
        }
        else if(cas>10)
        {
            System.out.println("si mayor a 10: " + cas);
        }
        else{System.out.println("entre 9 y 10: " + cas);}
        
        switch(cas){
            case 8:
                System.out.println("switch = 8: " + cas);
            case 10:
                System.out.println("switch = 10: " + cas);
            break;
            default:
                System.out.println("diferente: " + cas);
        }
        
        int [] vector = new int[11];
        final int veces=1000000;
        int i=0;
        int fmax,rmax;
        try {
            SecureRandom r = SecureRandom.getInstance("SHA1PRNG");
            for(i=0;i<veces;i++)
            {
                ++vector[r.nextInt(6)+r.nextInt(6)];

            }
            fmax=vector[0];
            rmax=2;
            System.out.printf("%s%12s%n", "dado", "frecuencia");
            for(i=0;i<vector.length;i++)
                {
                    System.out.printf("%d%12d%n",i+2,vector[i] );
                    if(vector[i]>fmax)
                    {
                        fmax=vector[i];
                        rmax=i+2;
                    }
                }
            System.out.println("el numero que mas cae es: "+rmax+" con una frecuencia de: "+fmax);
        } catch (NoSuchAlgorithmException ex) {
            System.out.println("Error "+ Operaciones.class.getName() + "\n"+ ex.getMessage());
        }
        
        
        

        
        
    }

}
