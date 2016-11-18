package programacionOrientadaObjetos;

/**
 * Created by pTHY on 14/11/2016.
 */
public class principal {

    public static void main(String[] args) {

        recipiente vasito = new recipiente();

        System.out.printf("Este vaso es %s y aparte es de color %s.%n", vasito.tamaño, vasito.colorDeRecipiente);

        vasito.vaciarRecipiente();
        vasito.estadoDelRecipiente();

    }

}
