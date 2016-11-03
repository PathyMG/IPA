package estructurasCiclo;

/**
 * Created by pTHY on 02/11/2016.
 */
public class cicloWhile {

    //Validación del ciclo While.
    public static void main(String[] args) {

        int digitoEntero = 15, inicializador = 2;
        int contador = 1;

        while(digitoEntero < 30)
        {
            System.out.println("El número " + digitoEntero + " se repite " + contador);
            digitoEntero++;
            contador++;
        }

    }
}
