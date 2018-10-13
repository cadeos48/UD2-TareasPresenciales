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
public class Ejercicio08 {
    public static void main(String[] args) {
        //Declaración e inicialización de variables
        int numero_Aleatorio;
        int numero_Usuario;
        
        //Expliación al usuario
        System.out.println("Adivina un número del 1 al 100");             
        
        //Procesamiento de datos        
        numero_Aleatorio = (int) (Math.random() * 100) + 1;        
        do {
            System.out.println("Dime un número");
            Scanner teclado = new Scanner(System.in);
            numero_Usuario = teclado.nextInt();
            if (numero_Usuario > numero_Aleatorio){
                System.out.println("Ese número es muy grande");
            } else if (numero_Usuario < numero_Aleatorio){
                System.out.println("Ese número es muy pequeño");
            } else {
                System.out.println("Has acertado el número");
            }
        } while (numero_Usuario != numero_Aleatorio);
    }
}
        
        