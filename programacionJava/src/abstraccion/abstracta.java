package abstraccion;

/**
 * Created by pTHY on 16/11/2016.
 */
public abstract class abstracta extends rectangulo {

    public static double pi = 3.1416;
    double area;

    public  void calculaAreaCirculo(int radio) {
        area = pi*(radio*radio);
        System.out.println("El area de este circulo es: " + area);
    }

    abstract public void metodoAbstracto();

}
