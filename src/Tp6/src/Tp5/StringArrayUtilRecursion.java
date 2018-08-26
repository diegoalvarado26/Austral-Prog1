package Tp6.src.Tp5;

import Tp6.src.Scanner.Scanner;

public class StringArrayUtilRecursion {
    private static void print_private(String[] array, int n, int longitud_array) {
        // Recibe arreglo de strings, muestra cada uno con número de índice y tabulado.
        if (n < longitud_array) {
            System.out.println(n + "\t" + array[n]);
            print_private(array, ++n, longitud_array);
        }
    }

    public static void print(String[] array) {
        print_private(array, 0, array.length);
    }

    public static int indexOf(int indice, String[] array, String string_buscado) {
        //Es el indexOf1, que busca a partir de un indice dado.
        if (indice >= array.length) {
            return -1;
        }
        if (array[indice] != null && array[indice].equals(string_buscado)) {
            return indice;
        }
        return indexOf(++indice, array, string_buscado);
    }

    public static int indexOf(String[] array, String busqueda) {
        // Es el el indexOf2, busca a partir de 0
        return indexOf(0, array, busqueda);
    }

    private static int indexOfEmpty_private(String[] array, int indice) {
        if (indice >= array.length) {
            return -1;
        }
        if (array[indice] == null) {
            return indice;
        }
        return indexOfEmpty_private(array, ++indice);
    }

    public static int indexOfEmpty(String[] array) {
        return indexOfEmpty_private(array, 0);
    }

    public static int put(String[] array, String palabra) {
        //Busca un lugar vacío y coloca un string en el primero que encuentra. Si no hay, -1.
        int posicion = indexOfEmpty(array);
        array[posicion] = palabra;
        return posicion;
    }

    public static int remove(String[] array, String string_a_remover) {
        //Encuentra un string en un array y lo elimina.
        return remove_private(array, string_a_remover, 0, 0);
    }

    private static int remove_private(String[] array, String string_a_remover, int n, int counter) {

        if (n < array.length) {

            int index = indexOf(array, string_a_remover);
            if (index != -1) {
                array[index] = null;
                return remove_private(array, string_a_remover, ++n, ++counter);
            }
            return remove_private(array, string_a_remover, ++n, counter);
        }
        return counter;
    }

    private static String[] fillArray_private(String frase, int can_strings, int n, String[] nuevo_array) {

        if (n < can_strings) {
            nuevo_array[n] = Scanner.getString(frase);
            return fillArray_private(frase, can_strings, ++n, nuevo_array);
        }
        return nuevo_array;
    }

    public static String[] fillArray(String frase, int can_strings) {
        String[] nuevo_array = new String[can_strings];
        return fillArray_private(frase, can_strings, 0, nuevo_array);
    }
}
