/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package avm.pre02;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ejercicio07 {
     public static void main(String[] args) {
        //Declaración e inicialización de variables
        int dividendo;
        int divisor = 3;
        int resto = 0;
        int cociente = 0;
                
        // Entrada de datos
        System.out.println("Dime un numero número");
        Scanner teclado = new Scanner(System.in);
        dividendo = teclado.nextInt();
        
        
        
        //Procesamiento y salida de datos
        //El problema está entre dividendos de 0 a 3!!!!!!!!!!!!!!!!!!!!!
        if (dividendo >= 0) {            
            do {
                dividendo = dividendo - divisor;                    
                cociente++;                
            }
            while (dividendo >= divisor);
            System.out.println("el cociente: " +cociente);
            System.out.println("el resto: " +dividendo);
        } else {
            System.out.println("No has introducido un número positivo");
        }             
     }
}
