package programacionOrientadaObjetos;

/**
 * Created by pTHY on 14/11/2016.
 */
public class principal {

    public static void main(String[] args) {

        recipiente vasito = new recipiente();

        System.out.println("Este vaso es " + vasito.tamaño + " y aparte es de color " + vasito.colorDeRecipiente + ".");

        vasito.llenarRecipiente();
        vasito.estadoDelRecipiente();

    }

}
