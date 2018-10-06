
package avm.pre02;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ejercicio01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Declaración e inicialización de variables
        int edad = 0;
        String evaluacion = "";
        
        //Entrada de datos
        System.out.println("Dime tu edad");
        Scanner teclado = new Scanner(System.in);
        edad = teclado.nextInt();
        
        //Procesamento de datos
        if (edad >= 18){
            evaluacion = "mayor de edad";
        } else {
            evaluacion = "menor de edad";
        }
        
        //Salida de datos
        System.out.println("Eres " + evaluacion);
    }
    
}
