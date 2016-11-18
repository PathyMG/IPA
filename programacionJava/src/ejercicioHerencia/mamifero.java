package ejercicioHerencia;

/**
 * Created by pTHY on 14/11/2016.
 */
public class mamifero {

    //Declaracion de atributos.
    private int noPatas = 0;
    private String longitudCuello = null;
    private String tipoMamifero = null;

    //Metodos.
    public void caracteristicas(String tipo, int patas, String longCuello) {
        this.tipoMamifero = tipo;
        this.noPatas = patas;
        this.longitudCuello = longCuello;
        System.out.println("\nEste mamifero es un(a) " + tipoMamifero + ".");
        System.out.println("Su numero de pies o patas es de " + noPatas + " y la longitud de su cuello es " + longitudCuello + ".");
    }

    public void respirar() {
        System.out.println("Respiracion de tipo pulmonar.");
    }

    public void comer(String comida) {
        System.out.println("Come " + comida + ".");
    }

    public void correr(String velocidad) {
        System.out.println("Corre " + velocidad + ".");
    }

}
