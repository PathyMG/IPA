package polimorfismoSobrecarga;

//import encapsulamiento.claseRestringida;

/**
 * Created by pTHY on 14/11/2016.
 */
public class principal {

    public static void main(String[] args) {

        sobrecarga objeto = new sobrecarga();

        objeto.mostrarC();
        objeto.mostrarC(312);

        polimorfismo objeto1 = new polimorfismo();
        objeto1.mostrarC();

        poli2 objeto2 = new poli2();
        objeto2.mostrarC();

        /*sobrecarga objeto1 = new sobrecarga();
        objeto1.mostrarC();
        sobrecarga objeto2 = new sobrecarga(23);
        objeto2.mostrarC();
        sobrecarga objeto3 = new sobrecarga(10,952);
        objeto3.mostrarC();*/

        //claseRestringida objeto3 = new claseRestringida();
        //objeto3.accesoMetodoPublico(21);

    }
}
