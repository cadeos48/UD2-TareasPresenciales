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
        /*Programa que realiza, medianta un bucle de tipo do-while, la sumatoria 
        de los numeros introducidos por el usuario, hasta que la sumatoria sea
        hasta que sea mayor o igual a 77 y muestra por pantalla el resultado
         de la sumatoria y la cantidad de números introducidos
         */
        //Declaración e inicialización de variables
        int numero;
        int contador = 0;
        int suma = 0;
        boolean validacion = false;
        Scanner teclado = new Scanner(System.in);
        
        
        // Entrada de datos
        do {
            try {
                do {
                    System.out.println("Dime un numero número");
                    numero = teclado.nextInt();
                    suma = numero + suma;              
                    contador++;
                }
                while (suma <77);
                validacion = true;
            }
            catch (Exception e){
                System.out.println("Dato erroneo");
                teclado.nextLine();//borrar memoria enter+letra
            }
        }
        while (validacion == false);
            
       //Salida de datos
       System.out.println("la suma total es: " +suma);
       System.out.println("el número total de números ha sido: " +contador);
     }
}