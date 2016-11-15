package introMetodos;

/**
 * Created by pTHY on 03/11/2016.
 */

//MARQUEZ GONZALEZ PATRICIA
//Fecha: 03/11/16
public class aplicaDescuento {

    //Declaracion de varibles.
    int descuentoTemp;
    float precioTemp;


    //Primer metodo.
    public void setDatos(float precio, int descuento) {

        precioTemp = precio;
        System.out.println("El precio es: $" + precio);
        descuentoTemp = descuento;
        System.out.println("El descuento a aplicar es: " + descuento + "%");

    }


    //Segundo metodo.
    public float getDescuento() {

        float desc = (precioTemp * descuentoTemp) / 100;
        float resultado = precioTemp - desc;
        return resultado;

    }


    //Tercer metodo.
    public void imprimir(float resultado) {

        System.out.println("El pago total aplicando el descuento es de $" + resultado);

    }


    public static void main(String[] args) {

        //Datos del alumno.
        System.out.println("Alumna: Patricia Marquez Gonzalez");
        System.out.println("Introduccion a la Programacion de Aplicaciones Moviles");
        System.out.println("Fecha: 03/11/16\n");

        aplicaDescuento objeto = new aplicaDescuento();

        //Para implementar el primer metodo es necesario colocar el valor de los argumentos.
        objeto.setDatos(850,20);

        //El segundo metodo realiza las operaciones para obtener el total a pagar aplicado ya el descuento.
        float pago = objeto.getDescuento();

        //El tercer metodo se encarga de imprimir el resultado.
        objeto.imprimir(pago);

    }

}
