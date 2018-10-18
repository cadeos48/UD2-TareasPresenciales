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
    /*Programa que valora si un número es par o impar mediante una estructura
    condicional */
    
        //Declaración e inicialización de variables
        int numero = 0;
        String parOImpar = "";
        boolean validacion = false;
        Scanner teclado = new Scanner(System.in);

        do {
            try {
                // Entrada de datos
                System.out.println("Dime un número");
                numero = teclado.nextInt();
                validacion = true;
                
                //Procesamiento de datos
                if (numero%2 == 0) {
                    parOImpar = "par";
                    } else {
                    parOImpar = "impar";
                    }
            }
             
            catch (Exception e){
                System.out.println ("Dato erroneo");
                teclado.nextLine();//borrar memoria enter+letra
            }
        }            
        while (validacion == false);
         
        //Salida de datos
        System.out.println("el número es:  " + parOImpar);
    }
}
