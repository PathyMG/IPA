package prisma;

/**
 * Created by pTHY on 14/11/2016.
 */
public class principal {

    public static void main(String[] args) {

        System.out.println("Alumna: Patricia Marquez Gonzalez");
        System.out.println("Introduccion a la Programacion de Aplicaciones Moviles\n");

        cubo ElCubo = new cubo();
        cilindro ElCilidro = new cilindro();

        ElCubo.setDatos(4);
        ElCilidro.setDatos(5, 12);

        System.out.printf("El area del cubo es %.2f, y su volumen es %.2f.\n",ElCubo.getArea(),ElCubo.getVolumen());
        System.out.printf("El area del cilindro es %.2f, y su volumen es %.2f.\n",ElCilidro.getArea(),ElCilidro.getVolumen());

    }

}
