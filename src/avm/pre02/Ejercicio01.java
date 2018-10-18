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
public class Ejercicio01 {
    public static void main(String[] args) {
    /*El método principal lee la edad por teclado y muestra en pantalla
    eres mayor o menor de edad realizando una evaluación mediante condicional
    */
    
        // Declaración e inicialización de variables
        int edad = 0;
        String evaluacion;
        boolean validacion = false;
        Scanner teclado = new Scanner(System.in);
        
        //Procesamiento de datos
        do {
            try {
                //Entrada de datos
                System.out.println("Dime tu edad");
                edad = teclado.nextInt();
                validacion = true;
                
                //Procesamiento de datos
                if (edad >= 0) {
                    if (edad >= 18) {
                        evaluacion = "mayor de edad";
                        } 
                    else {
                        evaluacion = "menor de edad";
                        }
                
                //Salida de datos
                System.out.println("eres " + evaluacion);
                } 
                
                // Gestión de edades erróneas
                else {
                    System.out.println("Has introducido un número negativo");
                    }
                } catch (Exception e) {
                /*Excepción para capturar un error general, en el programa capturaría
                un error de introducción de datos si el usuario introduce un valor
                que no sea un número
                */
                System.out.println("Dato erroneo");
                teclado.nextLine();//borrar memoria enter+letra
                }
            } while (edad < 0 || validacion == false);
    }
}
