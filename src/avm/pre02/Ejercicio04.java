/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package avm.pre02;

import java.util.Scanner;

/**
 *
 * @author yo
 */
public class Ejercicio04 {
     public static void main(String[] args) {
        //Declaración e inicialización de variables
        int numero = 0;
        int factorial = 1;
        
        // Entrada de datos
        System.out.println("Dime un número");
        Scanner teclado = new Scanner(System.in);
        numero = teclado.nextInt();
        
        //Procesamiento de datos
        if (numero <= 0) {
            System.out.println("Ese numero no es válido");
        }
        else{
            for (int i = numero; i >0; i--) {
                factorial = factorial * i;
            }
            System.out.println("el factorial de " +numero + " es: " +factorial);
         }
    }
}