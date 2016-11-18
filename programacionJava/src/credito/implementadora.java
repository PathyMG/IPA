package credito;

/**
 * Created by pTHY on 16/11/2016.
 */
public class implementadora extends pago {

    @Override
    public void metodoAbstracto() {
        setDatos(1500,10,24);
        System.out.println("Prestamo requerido: $" + monto);
        System.out.println("Interes generado: $" + getInteres());
        getPagoMensual();
        imprimePagoMensual();
    }

}
