package estructurasCiclo;

/**
 * Created by pTHY on 02/11/2016.
 */

//CRONOMETRO.
public class Bucles {

    public static void main(String[] args) {

        //Declaracion e inicializacion de variables.
        int i = 0, j = 0;

        //Datos del alumno.
        System.out.println("Alumna: Patricia Marquez Gonzalez");
        System.out.println("Introduccion a la Programacion de Aplicaciones Moviles\n");

        //Los siguientes ciclos for anidados realizan el conteo descendente del 60 al 0.

        //For para el retroceso de las decenas.
        for (i = 5; i >= 0; i--) {

            if(i==5)
            {

                System.out.println("Temporizador: 60");     //Marca el inicio del cronometro.

            }

            //For para el retroceso de las unidades.
            for (j = 9; j >= 0; j--) {

                System.out.print("Temporizador: ");
                System.out.print(i);                        //Imprime la decena.
                System.out.println(j);                      //Imprime la unidad.

            }

        }

    }

}

