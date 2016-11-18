package modificadores;

/**
 * Created by pTHY on 16/11/2016.
 */
public class comunicacion {

    private String mensaje = "conversacion privada entre paciente y doctor";

    private void mensajePrivado() {
        System.out.println("Ejemplo sobre la " + mensaje + ".");
    }

    public void mensajePublico() {
        System.out.println("El paciente no tiene restriccion, y puede platicar con quien sea sobre lo que padece.");
    }

    protected void mensajeProtegido() {
        System.out.println("El expediente del paciente se puede compartir solo con su permiso.");
    }

    void mensajeDefecto() {
        System.out.println("El doctor no puede platicar con cualquiera de la " + mensaje + ", solo con los familiares.");
    }

}
