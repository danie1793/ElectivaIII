/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javabasico;

import java.security.SecureRandom;
import java.util.Scanner;

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
        
        int [] vector = new int[12];
         int i=0,dado1=0,dado2=0,suma=0;
         
        SecureRandom numAle= new SecureRandom();
        
        for(i=0;i<1000000;i++)
        {
            dado1=numAle.nextInt(6)+1;
            dado2=numAle.nextInt(6)+1;
            suma=dado1+dado2;
            vector[suma-1]+=1;
            
        }
        
        
        
        for(int x=0;x<vector.length; x++)
        {
            
            System.out.println("\nPosicion: "+(x+1)+" valor: "+vector[x]);
        }
        
        
    }

}
