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
    /*Programa que solicita cinco números al usuario y calcula la media, 
      devolviéndola por pantalla. Se utiliza un bucle de tipo for para 
      solicitar los números y realizar la sumatoria.
      */
        //Declaración e inicialización de variables
        double numero;
        int contador;
        double suma = 0;
        double media;//tipo double por si la media tiene decimales
        boolean validacion = false;
        Scanner teclado = new Scanner(System.in);
        
        do {
            try {
                for (contador = 1; contador <= 5; contador++) {/* Si se introduce
                    una letra dentro del bucle, se produce una excepcion que
                    interrumple la secuencia de instrucciones, da el control
                    a catch, ejecuta las instrucciones que hay entre sus llaves
                    y luego devuelve el control a las instrucciones que hay dentro
                    del try. El problema es que la variable contador se inicializa
                    a 0 de nuevo, no guarda el valor que tenia si se ha ejecutado
                    anteriormente alguna vez,así que si un usuario introduce 3
                    números por ejemplo y luego una letra, contador se vuelve a
                    inicializar y tendrá que volver a introducir 5 números
                    */
                    //Entrada de datos
                    System.out.println("Dime un número");
                    numero = teclado.nextInt();
                    
                    //Procesamiento de datos
                    suma = numero + suma;//acumulador que realiza la sumatoria
                }
                 validacion = true;
            }
            catch (Exception e) {
                System.out.println("Dato erroneo");
                teclado.nextLine();//borrar memoria enter+letra
            }
        }
        while (validacion == false);
          
       //calculo de la media dividiendo el acumulador entre el total de números        
        media = suma / 5;
        
        //salida de datos
        System.out.println("la media de los 5 números es: " +media);
  }
}
