package prisma;

/**
 * Created by pTHY on 14/11/2016.
 */
public class cubo {

    private float numeroDeLados = 0;
    private float lado;
    private float area;
    private float volumen;

    public cubo() {
        numeroDeLados = 6;
    }

    public void setDatos(float elLado) {
        lado = elLado;
        area = lado*numeroDeLados;
        volumen = lado*lado*lado;
    }

    public float getArea() {
        return area;
    }

    public float getVolumen() {
        return volumen;
    }

}
