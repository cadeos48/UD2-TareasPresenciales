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
        //El método principal lee la edad por teclado y te dice si eres mayot o menor de edad

        // Declaración e inicialización de variables
        int edad = 0;
        String evaluacion = "";
        boolean validacion = false;

        Scanner teclado = new Scanner(System.in);

        do {
            try {
                //Entrada de datos
                System.out.println("Dime tu edad");
                edad = teclado.nextInt();
                validacion = true;

                //Procesamiento de datos
                if (edad >= 18) {
                    evaluacion = "mayor de edad";
                } else {
                    evaluacion = "menor de edad";
                }

                //Salida de datos
                System.out.println("Eres " + evaluacion);
            } catch (Exception e) {
                System.out.println("Dato erroneo");
                teclado.nextLine();//borrar memoria enter+letra
            }
        } while (validacion == false);
    }
}
