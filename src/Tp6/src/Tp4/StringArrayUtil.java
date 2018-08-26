package Tp6.src.Tp4;

import Tp6.src.Scanner.Scanner;

public class StringArrayUtil {
    public static void print(String[] array)
    // Recibe arreglo de strings, muestra cada uno con número de índice y tabulado.
    {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == null) {
                continue;
            } else {
                System.out.println(i + "\t " + array[i]);
            }

        }

    }

    public static int indexOf(int indice, String[] array, String string_buscado)
    //Es el indexOf1, que busca a partir de un indice dado.
    {
        for (int i = indice; i < array.length; i++) {
            if (array[i] == null) {
                continue;
            } else if (array[i].equals(string_buscado)) {
                return i;
            }
        }

        return -1;

    }

    public static int indexOf(String[] array, String busqueda)
    // Es el el indexOf2, busca a partir de 0
    {
        return indexOf(0, array, busqueda);
    }

    public static int indexOfEmpty(String[] arreglo) {
        return indexOf(0, arreglo, null);
    }

    public static int put(String[] array, String palabra) {
        for (int i = 0; i < array.length; i++) {
            if (array[i].isEmpty()) {
                array[i] = palabra;
                return i;
            }

        }
        return -1;
    }

    public static int remove(String[] array, String string_a_remover)
    //Encuentra un string en un array y lo elimina.
    {
        int contador = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(string_a_remover)) {
                array[i] = "";
                contador++;
            }
        }

        return contador;
    }

    public static String[] fillArray(String frase, int can_strings) {
        System.out.println(" ");
        String[] array_novo = new String[can_strings];
        for (int i = 0; i < can_strings; i++) {
            array_novo[i] = Scanner.getString(frase);
        }
        return array_novo;
    }
}
