package BusquedaLineal;

import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Scanner;

public class PruebaBusquedaLineal {
    public static int busquedaLineal(int datos[], int claveBusqueda) {
        for (int i = 0; i < datos.length; i++)
            if (datos[i] == claveBusqueda)
                return i;
        return -1;
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        SecureRandom generador = new SecureRandom();

        int[] datos = new int[10];

        for (int i = 0; i < datos.length; i++)
            datos[i] = 10 + generador.nextInt(90);

        System.out.printf("%s%n%n", Arrays.toString(datos));

        System.out.println("Escriba un valor entero (-1 para terminar): ");
        int enteroBusqueda = entrada.nextInt();

        while (enteroBusqueda != -1) {
            int posicion = busquedaLineal(datos, enteroBusqueda);

            if (posicion == -1)
                System.out.printf("%d no se encontró%n%n", enteroBusqueda);
            else
                System.out.printf("%d se encontró en la posición %d%n%n", enteroBusqueda, posicion);

            System.out.println("Escriba un valor entero (-1 para terminar): ");
            enteroBusqueda = entrada.nextInt();
        }
    }
}
