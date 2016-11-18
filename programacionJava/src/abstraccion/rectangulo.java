package abstraccion;

/**
 * Created by pTHY on 16/11/2016.
 */
public class rectangulo {

    double area;

    public void calculaAreaRectangulo(int alto, int ancho) {
        area = (ancho)*(alto);
        System.out.println("El area de este rectangulo es: " + area);
    }

}
