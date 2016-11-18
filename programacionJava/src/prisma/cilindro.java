package prisma;

/**
 * Created by pTHY on 14/11/2016.
 */
public class cilindro {

    private float numeroDeLados = 0;
    private float radio;
    private float altura;
    private float area;
    private float volumen;
    public static float pi = (float)(3.141516);

    public cilindro() {
        this.numeroDeLados = 3;
    }

    public void setDatos(float elRadio, float laAltura) {
        radio = elRadio;
        altura = laAltura;
        area = (2)*pi*radio*(altura+radio);
        volumen = pi*radio*radio*altura;
    }

    public float getArea() {
        return area;
    }

    public float getVolumen() {
        return volumen;
    }

}
