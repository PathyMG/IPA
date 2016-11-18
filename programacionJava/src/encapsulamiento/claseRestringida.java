package encapsulamiento;

/**
 * Created by pTHY on 15/11/2016.
 */
public class claseRestringida {

    private int numeroAleatorio = 122;
    private String accessDenied = "Soy una variable cadena muy restringida.";
    protected String accesoParcial = "Soy un acceso parcial Protected";

    private void accesoMetodoPrivado() {
        System.out.println(numeroAleatorio);
    }

    public void accesoMetodoPublico(int numeroAleatorio) {
        this.numeroAleatorio = numeroAleatorio;
        System.out.println(numeroAleatorio);
    }

    protected void accesoMetodoProtegido(int numeroAleatorio) {
        this.numeroAleatorio = numeroAleatorio;
        System.out.println(numeroAleatorio);
    }

    void accesoMetodoDefecto(String accessDenied) {
        this.accessDenied = accessDenied;
        System.out.println(this.accessDenied);
    }

}
