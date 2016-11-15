package introMetodos;

/**
 * Created by pTHY on 03/11/2016.
 */
public class metodoClasico {

    public static void main(String[] args) {

        int variable1, variable2;

        coleccionDeMetodos gatillo  = new coleccionDeMetodos();

        gatillo.metodo1();
        gatillo.metodo3(542, 545);
        variable1 = gatillo.metodo2();
        System.out.println(variable1);

    }

}
