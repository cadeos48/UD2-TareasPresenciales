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
        /* Programa que realiza una división mediante restas sucesivas. Se
        utiliza un condicional if-else para
        */
        //Declaración e inicialización de variables
        int dividendo=0;
        int divisor = 3;
        int resto = 0;
        int cociente = 0;
        Scanner teclado = new Scanner(System.in);
        boolean validacion = false;
     
        do {
            try {
                 // Entrada de datos
                 System.out.println("Dime un numero número");
                 dividendo = teclado.nextInt();
                 validacion = true;
                 //Procesamiento y salida de datos          
                 if (dividendo >= 0) {
                     resto = dividendo; /* Si el dividendo es menor de 3,
                     el cociente es cero y el resto será igual al dividendo.
                     No entrará en while porque dividendo es menor a 3 (valor de divisor)
                    */
                     while (dividendo >= divisor) {
                         dividendo = dividendo - divisor;
                         cociente++;
                     }
                 }
                 else {
                     System.out.println("No has introducido un número positivo");
                 }
            }
            catch (Exception e) {
                System.out.println("Dato erroneo");
                teclado.nextLine();//borrar memoria enter+letra
            }
        }
        while (validacion == false || dividendo < 0);
        System.out.println("el cociente: " +cociente);
        System.out.println("el resto: " +dividendo);
    }
}