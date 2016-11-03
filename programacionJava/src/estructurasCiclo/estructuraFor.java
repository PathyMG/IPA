package estructurasCiclo;

/**
 * Created by pTHY on 02/11/2016.
 */
public class estructuraFor {

    public static void main(String[] args) {

        int incrementaValor1 = 10, incrementaValor2 = 30;
        String valor = "Avance";

        for(int i = 1; i<=incrementaValor1; i++)
        {
            System.out.println("Incrementamos la variable String con el valor " + valor + " " + i);

            for(int j = 21; j<=incrementaValor2; j++)
            {
                System.out.println("Incrementamos la variable String con el valor " + valor + " " + j);
            }
        }

    }
}
