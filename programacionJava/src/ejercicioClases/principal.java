package ejercicioClases;

/**
 * Created by pTHY on 15/11/2016.
 */
public class principal {

    public static void main(String[] args) {

        System.out.println("Alumna: Patricia Marquez Gonzalez");
        System.out.println("Introduccion a la Programacion de Aplicaciones Moviles\n");

        congelador miCongelador = new congelador();

        //Impresion de las caracteristicas del objeto.
        System.out.println("El congelador es " + miCongelador.tamaño + ", es de color " + miCongelador.color + ", y esta construido de " + miCongelador.materialConstruccion + ".");

        //Acceso a los metodos del objeto.
        miCongelador.estadoCongelador();
        miCongelador.apagarCongelador();
        miCongelador.estadoCongelador();

    }

}
