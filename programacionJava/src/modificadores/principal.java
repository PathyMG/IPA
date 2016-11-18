package modificadores;

/**
 * Created by pTHY on 16/11/2016.
 */
public class principal {

    public static void main(String[] args) {

        /*Con este ejemplo se trata de hacer una analogia sobre la conversacion
         entre medico-paciente y loa modificadores de acceso.*/

        System.out.println("Alumna: Patricia Marquez Gonzalez");
        System.out.println("Introduccion a la Programacion de Aplicaciones Moviles\n");

        comunicacion objeto1 = new comunicacion();

        objeto1.mensajeProtegido();
        objeto1.mensajePublico();
        objeto1.mensajeDefecto();

    }

}
