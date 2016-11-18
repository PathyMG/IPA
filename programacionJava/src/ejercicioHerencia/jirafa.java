package ejercicioHerencia;

/**
 * Created by pTHY on 14/11/2016.
 */
public class jirafa extends mamifero {

    public void caracteristicasJirafa() {
        caracteristicas("jirafa", 4, "largo");
    }

    public void comportamientoJirafa() {
        respirar();
        comer("hojas");
        correr("rapido");
    }

}
