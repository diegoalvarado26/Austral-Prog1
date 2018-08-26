package Tp5;

import Scanner.*;

public class StringArrayUtilRecursionTester {
    public static void main(String[] args) {
        String[] matriz_1 = StringArrayUtilRecursion.fillArray("Ingrese 5 strings: ", 5);

        System.out.println(" ");
        System.out.println("Su arreglo es el siguiente: ");
        StringArrayUtilRecursion.print(matriz_1);

        System.out.println(" ");

        String string_verificar = Scanner.getString("Ingrese un string y verifique si esta en el arreglo: ");

        if ((StringArrayUtilRecursion.indexOf(matriz_1, string_verificar)) > -1) {

            System.out.println("Existe el string que ingreso! El mismo ha sido borrado.");
            StringArrayUtilRecursion.remove(matriz_1, string_verificar);
        } else {
            System.out.println("No existe el string");
        }

        System.out.println(" ");

        String nuevo_string = Scanner.getString("Ingrese un string para anexar a su arreglo: ");
        if (StringArrayUtilRecursion.put(matriz_1, nuevo_string) != -1) {
            System.out.println("Se ha anexado el string!");
        } else {
            System.out.println("No se logró encontrar un espacio para el string.");
        }

        System.out.println(" ");

        System.out.println("Su nuevo arreglo es: ");
        StringArrayUtilRecursion.print(matriz_1);


    }
}
