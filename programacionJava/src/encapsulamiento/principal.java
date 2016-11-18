package encapsulamiento;

/**
 * Created by pTHY on 15/11/2016.
 */
public class principal {

    public static void main(String[] args) {

        claseRestringida objeto1 = new claseRestringida();
        objeto1.accesoMetodoDefecto("Hola mundo!");

        claseDeAcceso objeto2 = new claseDeAcceso();
        objeto2.defineCadena1("Hola, soy una variable que se agregara a una variable privada.");
        System.out.println(objeto2.consigueCadena1());

    }

}
