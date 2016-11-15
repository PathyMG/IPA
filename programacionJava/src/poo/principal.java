package poo;

/**
 * Created by pTHY on 14/11/2016.
 */
public class principal {

    public static void main(String[] args) {

        System.out.println("Alumna: Patricia Marquez Gonzalez");
        System.out.println("Introduccion a la Programacion de Aplicaciones Moviles\n");

        //Se instancia un objeto de tipo refrigerador.
        refrigerador miRefri = new refrigerador();

        //Impresion de las caracteristicas del objeto.
        System.out.println("El refrigerador es " + miRefri.tamaño + ", es de color " + miRefri.color + ", y esta construido de " + miRefri.materialConstruccion + ".");

        //Acceso a los metodos del objeto.
        miRefri.estadoRefrigerador();
        miRefri.apagarRefrigerador();
        miRefri.estadoRefrigerador();

    }

}
