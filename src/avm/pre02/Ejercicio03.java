package avm.pre02;


import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yo
 */
public class Ejercicio03 {
   public static void main(String[] args) {
    /* Programa que imprime en pantalla el número de días que tiene un mes,
       en función de la posición ordinal que este ocupa y que introduce el 
       usuario. Se utiliza estructura condicional while ya que las opciones
       posibles son conocidas (12)
       */
        //Declaración e inicialización de variables
        int mes = 0;
        Scanner teclado = new Scanner(System.in);
        boolean validacion = false;
        
        do {
            try {
                // Entrada de datos
                 System.out.println("Dime el mes");
                 mes = teclado.nextInt();
                 validacion = true;
                //Procesamiento de datos
                 switch (mes) {
                     case 1:
                     case 3:
                     case 5:
                     case 7:
                     case 8:
                     case 10:
                     case 12:
                         System.out.println("Este mes tiene 31 días");
                     break;
                     
                     case 4:
                     case 6:
                     case 9:
                     case 11:
                         System.out.println("Este mes tiene 30 días");
                     break;
                     
                     case 2:
                         System.out.println("Este mes tiene 28 o 29 días");
                     break;
                     
                     default:
                         System.out.println("Ese mes no es válido");
                 }
            }
            catch (Exception e) {
                System.out.println("Dato erroneo");
                teclado.nextLine();//borrar memoria enter+letra
            }
        }
        while(validacion == false);
   }
}