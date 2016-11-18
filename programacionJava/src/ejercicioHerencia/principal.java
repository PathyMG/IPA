package ejercicioHerencia;

/**
 * Created by pTHY on 14/11/2016.
 */
public class principal {

    public static void main(String[] args) {

        System.out.println("Alumna: Patricia Marquez Gonzalez");
        System.out.println("Introduccion a la Programacion de Aplicaciones Moviles");

        serHumano persona = new serHumano();
        jirafa animal = new jirafa();

        persona.caracteristicasHumano();
        persona.comportamientoHumano();

        animal.caracteristicasJirafa();
        animal.comportamientoJirafa();

    }

}
