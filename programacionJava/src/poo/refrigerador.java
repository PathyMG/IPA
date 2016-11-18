package poo;

/**
 * Created by pTHY on 14/11/2016.
 */
public class refrigerador {

    //Declaracion e inicializacion de atributos.
    String color = "beige";
    String tamanio = "mediano";
    String materialConstruccion = "aluminio y plastico";
    boolean onOff = true;                                       //Indica si el refrigerador esta conectado a la luz, o bien encendido.

    //Metodos.
    public void encenderRefrigerador() {
        onOff = true;
        System.out.println("El refrigerador esta encendido.");
    }

    public void apagarRefrigerador() {
        onOff = false;
        System.out.println("El refrigerador esta apagado.");
    }

    public void estadoRefrigerador() {
        if(onOff)
        {
            System.out.println("El refrigerador esta enfriando.");
        }
        else
        {
            System.out.println("El refrigerador esta descongelando.");
        }
    }

}
