package credito;

/**
 * Created by pTHY on 16/11/2016.
 */
public abstract class pago extends interes {

    private float pagoTotalMensual;

    public float getPagoMensual() {
        pagoTotalMensual = (monto + pagoInteres)/12;
        return pagoTotalMensual;
    }

    public void imprimePagoMensual() {
        System.out.println("Debera pagar mensualmente por el prestamo y el interes generado: $" + pagoTotalMensual);
    }

    abstract public void metodoAbstracto();

}
