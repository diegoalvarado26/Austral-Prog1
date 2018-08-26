package Tp6;

import java.util.Scanner;

public class IntegerArrayUtil {
    public static String toString(int[] arreglo_ints) {
        //Recibe un array de ints y devuelve un string de la forma {a, b, c, ...}
        String w = "{";
        for (int i = 0; i < (arreglo_ints.length - 1); i++) {
            w += (String) (arreglo_ints[i] + ", ");
        }
        w += arreglo_ints[arreglo_ints.length - 1];
        w += "}";
        return w;
    }

    public static int sum(int[] ints_a_sumar) {
        //Recibe un arreglo de ints y lo suma
        int suma = 0;
        for (int i = 0; i < ints_a_sumar.length; i++) {
            suma += ints_a_sumar[i];
        }
        return suma;
    }

    public static double avg(int[] arreglo_ints) {
        double suma_1 = sum(arreglo_ints);
        suma_1 = suma_1 / (arreglo_ints.length);
        return suma_1;
    }

    public static int max(int[] arreglo_ints) {
        int maximo = arreglo_ints[0];
        for (int j = 0; j < arreglo_ints.length; j++) {
            if (maximo < arreglo_ints[j]) {
                maximo = arreglo_ints[j];
            }
        }
        return maximo;
    }

    public static int min(int[] arreglo_ints) {
        int minimo = arreglo_ints[0];
        for (int k = 0; k < arreglo_ints.length; k++) {
            if (minimo > arreglo_ints[k]) {
                minimo = arreglo_ints[k];
            }
        }
        return minimo;
    }

    public static int[] fillArray(String mensaje, int numero_ints) {
        System.out.println(mensaje);
        System.out.println(" ");
        int[] array_novo = new int[numero_ints];
        Scanner input = new Scanner(System.in);
        for (int l = 0; l < array_novo.length; l++) {
            System.out.println("Ingrese el numero en la posicion " + (l) + " de su arreglo.");
            array_novo[l] = input.nextInt();
        }
		/*System.out.println("El array creado es el siguiente: ");
		System.out.println(" ");

		for (int m = 0; m < numero_ints; m++){
			System.out.println( "Numero en la posicion " + m + "\t" + array_novo[m]);
		}*/
        return array_novo;
    }

    public static int[] sort(int[] arreglo_ints) {
        int arreglo_length = arreglo_ints.length;
        int temp = 0;

        for (int i = 0; i < arreglo_length; i++) {
            for (int j = 1; j < (arreglo_length - i); j++) {
                if (arreglo_ints[j - 1] > arreglo_ints[j]) {
                    temp = arreglo_ints[j - 1];
                    arreglo_ints[j - 1] = arreglo_ints[j];
                    arreglo_ints[j] = temp;
                }
            }
        }
        return arreglo_ints;

    }
}
