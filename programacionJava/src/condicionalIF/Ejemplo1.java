package condicionalIF;

import java.util.Scanner;

/**
 * Created by pTHY on 02/11/2016.
 */
public class Ejemplo1 {

    public static void main(String[] args) {

        int edad;

        System.out.println("Alumna: Patricia Márquez González");
        System.out.println("Introducción a la Programación de Aplicaciones Móviles\n");

        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingresa tu edad: ");
        edad = teclado.nextInt();

        if(edad<18)
        {
            System.out.println("¡Eres menor de edad!");
        }
        else
        {
            System.out.println("¡Eres mayor de edad!");
        }

    }
}
