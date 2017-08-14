/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javabasico;
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
    Scanner vscan= new Scanner(System.in);
    
    vInt = 5+2;
    System.out.println("5+2 : "+vInt);
    vInt = 5-2;
    System.out.println("5-2 : "+vInt);
    vInt = 5*2;
    System.out.println("5*2 : "+vInt);
    vInt = 5%2;
    System.out.println("5%2 : "+vInt);
    vInt = 5 ^ 2;
    System.out.println("5^2 : "+vInt);
    System.out.println("\n");
    
    vFloat = 5+2;
    System.out.println("5+2 : "+vFloat);
    vFloat = 5-2;
    System.out.println("5-2 : "+vFloat);
    vFloat = 5*2;
    System.out.println("5*2 : "+vFloat);
    vFloat = 5%2;
    System.out.println("5%2 : "+vFloat);
    vFloat = 5 ^ 2;
    System.out.println("5^2 : "+vFloat);
    System.out.println("\n");
    
    /*vStr = "David ";
    vStr += "William";
    System.out.println("Cadena: "+ vStr);
    System.out.println("\n");*/
    
    b1= true;
    b2= false;
    System.out.println("&&: "+ (b1 && b2));
    System.out.println("||: "+ (b1 || b2));
    System.out.println("¬b1: "+ (!b1));
    System.out.println("¬b2: "+ (!b2));
    System.out.println("\n");
    
    System.out.println("texto: ");
    System.out.println(vscan.nextLine());
    System.out.println("\n");
    
    for(int i=0; i<5; i++)
    {
       System.out.println(i); 
    }
}
    
}
