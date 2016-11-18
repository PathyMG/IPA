package credito;

/**
 * Created by pTHY on 16/11/2016.
 */
public class interes {

    public float monto;
    private float tasa;
    private float tiempo;
    public float pagoInteres;

    public void setDatos(float monto, float tasa, float tiempo) {
        this.monto = monto;
        this.tasa = tasa;
        this.tiempo = tiempo;
    }

    public float getInteres() {
        pagoInteres = monto*(tasa/100)*(tiempo/12);
        return pagoInteres;
    }

}
