package programacionOrientadaObjetos;

/**
 * Created by pTHY on 14/11/2016.
 */
public class recipiente {

    boolean statusDelVaso = true;
    //int entero;
    String colorDeRecipiente = "azul", tamaño = "chico";

    public void llenarRecipiente() {
        System.out.println("El recipiente se ha llenado.");
        statusDelVaso = true;
    }

    public void vaciarRecipiente() {
        System.out.println("El recipiente se ha vaciado.");
        statusDelVaso = false;
    }

    public void estadoDelRecipiente() {
        System.out.println(statusDelVaso);
        if(statusDelVaso)
        {
            System.out.println("El recipiente esta lleno.");
        }
        else
        {
            System.out.println("El recipiente esta vacio.");
        }
    }

}
