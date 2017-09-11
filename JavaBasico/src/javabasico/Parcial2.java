/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javabasico;

import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;

/**
 *
 * @author ESTUDIANTE
 */
public class Parcial2 {
    public static void main(String[] args) {
     /*2)la empresa de energia Lucecita quiere un sistema para procesar sus facturas, el programa debe recibir 100 facturas con valor del consumo mensual en 
        KiloVatios(numero aleatorio entre 10 y 1000) y el estrato (aleatorio entre 1 y 6) el valor de la factura se calculara de la siguiente forma:
        
        si consumo < 50 hogar pequeño y paga $ 1000 por KiloVatio
        si consumo esta entre  51 y 700 hogar mediano y paga 2000 por KV
        si consumo entre 701 yu 1000 es hogar derrochador y debe pagar 2500
        
        estreatos 1y2 descuento 15%
        estratos 3 y 4 tarifa "PLENA"
        estratos 5 y 6 impuesto 5%
        
        calcular
        cuanto pagan por las 100 facturas
        cuantas facturas estan por encima del promedio
        cuantas facturas tienen consumo repetido*/
        
        float [] facturas = new float[100];
        float []Vfacturas = new float[100];
        float Tfacturas = 0;
        int Kv=0, estra=0;
        float desc = 0, imp= 0, igual=0;
        
        try {
            SecureRandom r = SecureRandom.getInstance("SHA1PRNG");
            
            for(int i=0; i<100; i++)
            {
                Kv=r.nextInt(1000)+1;
                estra= r.nextInt(6)+1;
                facturas[i]= Kv;
                if(facturas[i]<50)
                {
                    facturas[i]=facturas[i]*1000;
                }
                else if(facturas[i]<=700)
                {
                    facturas[i]=facturas[i]*2000;
                }
                else if(facturas[i]<=1000)
                {
                    facturas[i]=facturas[i]*2500;
                }
                else{System.out.println("nada");}
                
                if(estra<3)
                {
                    desc= (float) (facturas[i] * 0.15);
                    Vfacturas[i] = facturas[i]-desc;
                }
                else if(estra<5)
                {
                    Vfacturas[i] = facturas[i]-desc;
                }
                
                else if(estra <=6)
                {
                    imp=(float) (facturas[i]*0.5);
                    Vfacturas[i]= facturas[i]+imp;
                }
                
                Tfacturas=Tfacturas+Vfacturas[i];
                System.out.println("\nFactura: ["+(i+1)+"] estrato: ["+estra +"] valor: "+Vfacturas[i]);

            }
                            for(int j=0; j<Vfacturas.length-1; j++)
                {
                       if(Vfacturas[j]==Vfacturas[j+1])
                       {
                           igual+=1;
                       }
                }
            System.out.println("total a pagar por las facturas: "+Tfacturas);
            System.out.println("\nFacuras iguales: "+igual);
                
        } catch (NoSuchAlgorithmException ex) {
            System.out.println("Error "+ Operaciones.class.getName() + "\n"+ ex.getMessage());
        }
    
    }
}
