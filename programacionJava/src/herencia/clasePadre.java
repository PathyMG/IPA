package herencia;

/**
 * Created by pTHY on 14/11/2016.
 */
public class clasePadre {

    int resultado, operador1, operador2;

    public void metodoPadre(int x) {
        operador1 = x;
        operador2 = 12;
        resultado = operador1 + operador2;
    }

    public void metodoPadre2() {
        System.out.println("Este es el resultado de mi operacion en la clase padre " + resultado);
    }

}
