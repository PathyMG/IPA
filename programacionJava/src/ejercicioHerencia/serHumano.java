package ejercicioHerencia;

/**
 * Created by pTHY on 14/11/2016.
 */
public class serHumano extends mamifero {

    public void caracteristicasHumano() {
        caracteristicas("ser humano", 2, "corto");
    }

    public void comportamientoHumano() {
        respirar();
        comer("carne, frutas, verduras, y lacteos");
        correr("lento");
    }

}
