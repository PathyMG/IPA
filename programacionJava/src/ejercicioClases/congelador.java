package ejercicioClases;

/**
 * Created by pTHY on 15/11/2016.
 */
public class congelador {

    //Declaracion e inicializacion de atributos.
    String color = "beige";
    String tamaño = "mediano";
    String materialConstruccion = "aluminio y plastico";
    boolean onOff = true;                  //Indica si el refrigerador esta conectado a la luz, o bien encendido.

    //Metodos.
    public void encenderCongelador() {
        onOff = true;
        System.out.println("El congelador esta encendido.");
    }

    public void apagarCongelador() {
        onOff = false;
        System.out.println("El congelador esta apagado.");
    }

    public void estadoCongelador() {
        if(onOff)
        {
            System.out.println("El congelador esta enfriando.");
        }
        else
        {
            System.out.println("El congelador esta descongelando.");
        }
    }

}
