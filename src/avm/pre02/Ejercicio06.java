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
public class Ejercicio06 {
     public static void main(String[] args) {
        //Declaración e inicialización de variables
        int numero;
        int contador = 0;
        int suma = 0;
        
        
        // Entrada de datos
       do {
           System.out.println("Dime un numero número");
           Scanner teclado = new Scanner(System.in);
           numero = teclado.nextInt();
           System.out.println(numero);
           suma = numero + suma;              
           contador = contador+1;
       }
       while (suma <=77);
       
       //Salida de datos
       System.out.println("la suma total es: " +suma);
       System.out.println("el número total de números ha sido: " +contador);
     }
}