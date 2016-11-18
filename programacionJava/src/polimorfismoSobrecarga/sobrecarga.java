package polimorfismoSobrecarga;

import modificadores.comunicacion;

/**
 * Created by pTHY on 14/11/2016.
 */
public class sobrecarga {

    private int inicia1, inicia2, inicia3, resultado;

    public sobrecarga(int param1) {
        inicia1 = 66;
        resultado = inicia1 * param1;
    }

    public sobrecarga() {
        inicia1 = 121;
        resultado = inicia1 * 95;
    }

    public sobrecarga(int param1, int param2) {
        inicia1 = 121;
        resultado = inicia1 * param1 + param2;
    }

    public void mostrarC() {
        System.out.println(resultado);
    }

    public void mostrarC(int entero) {
        System.out.println(resultado + " Soy un metodo sobrecargado.");
    }

}