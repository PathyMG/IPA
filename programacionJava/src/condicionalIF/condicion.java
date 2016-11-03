package condicionalIF;

/**
 * Created by pTHY on 02/11/2016.
 */
public class condicion {

    public static void main(String[] args) {

        int compara1 = 24, compara2 = 24;
        boolean comparacion = false;

        if(compara1==compara2)
        {
            if(comparacion)
            {
                System.out.println("La variable comparacion es un booleano que es true.");
            }
            else
            {
                System.out.println("La variable comparacion es un booleano que es false.");
            }
        }

        else
        {
            System.out.println("Este numero entero " + compara1 + " no es igual a este numero entero " + compara2);
        }

    }

}
