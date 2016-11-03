package condicionalIF;

/**
 * Created by pTHY on 02/11/2016.
 */
public class Pregunta1 {

        public static void main(String[] args) {

            int edad=12;

            //Datos del alumno.
            System.out.println("Alumna: Patricia Marquez Gonzalez");
            System.out.println("Introduccion a la Programacion de Aplicaciones Moviles\n");

            //Compara segun la edad predefinida:
            if(edad<18)     //Si es menor a 18 significa que es una persona menor de edad.
            {
                System.out.print("Si tienes " + edad + " entonces eres menor de edad");
                //Las siguientes comparaciones son con fines didacticos.
                if(edad>=12)    //Si tienes 12 o mas entonces eres un adolescente.
                {
                    System.out.println(". Ademas, se puede decir que estas en la adolescencia.");
                }
                else            //Sino significa que eres un infante.
                {
                    System.out.println(", y ademas eres un infante.");
                }
            }
            else            //Sino significa que es mayor de edad.
            {
                System.out.println("Si tienes " + edad + " entonces eres mayor de edad.");
            }

        }

}