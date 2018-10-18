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
     /* Calcula el factorial de un nùmero introducido por teclado. El programa
         utiliza una estructura condicional para evaluar si el número es mayor
         que cero y un bucle for para calcular el factorial
         */
     
        //Declaración e inicialización de variables
        int numero = 0;
        long factorial = 1;/* Defino la variable tipo long, ya que el factorial
        genera números muy grandes que pueden desbodar la memoria reservada a
        un tipo int
        */
        boolean validacion = false;
        Scanner teclado = new Scanner(System.in);
        
        // Entrada de datos
        do {
            try {
                System.out.println("Dime un número");
                numero = teclado.nextInt();
                validacion = true;
                
                //Procesamiento de datos
                if (numero <= 0) {
                     System.out.println("Ese numero no es válido");
                }                     
                else{
                    for (int i = numero; i>0; i--) {
                        factorial = factorial * i;                
                    }
                System.out.println("El factorial de " +numero +" es " +factorial);
                }
            }             
            catch (Exception e) {
                System.out.println("Dato erroneo");
                teclado.nextLine();//borrar memoria enter+letra
            }
        }
        while (validacion == false);
                
     }
}