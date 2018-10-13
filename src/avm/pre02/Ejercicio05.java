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
public class Ejercicio05 {
  public static void main(String[] args) {
        //Declaración e inicialización de variables
        double numero;
        int contador;
        double suma = 0;
        double media = 0;
        
        // Entrada de datos
       for (contador = 1; contador <= 5; contador++) {
           System.out.println("Dime un número");
           Scanner teclado = new Scanner(System.in);
           numero = teclado.nextInt();
           suma = numero + suma; 
       }
       
        //Procesamiento de datos        
        media = suma / 5;
        
        //salida de datos
        System.out.println("la media de los 5 números es: " +media);
  }
}
