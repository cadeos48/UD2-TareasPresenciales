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
public class Ejercicio02 {
    
    public static void main(String[] args) {
        //Declaración e inicialización de variables
        int numero = 0;
        String parOImpar = "";
        
        // Entrada de datos
        System.out.println("Dime un número");
        Scanner teclado = new Scanner(System.in);
        numero = teclado.nextInt();
        
        //Procesamiento de datos
        if (numero%2 = 0) {
            parOImpar = "impar";
        } else {
            parOImpar = "par";
        }
        
        //Salida de datos
        System.out.println("el número es:  " + parOImpar);
    }
}
