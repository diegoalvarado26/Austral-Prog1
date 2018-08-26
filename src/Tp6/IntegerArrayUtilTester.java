package Tp6;

import java.util.Scanner;

public class IntegerArrayUtilTester {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Cuantos ints (n) quiere ingresar en su arreglo?");
        int numero_ints = input.nextInt();

        int[] array_ints = IntegerArrayUtil.fillArray("Ahora se va a crear su array", numero_ints);

        String enunciado = "---------- \n" + "Operaciones: \n" + "1. Print \n" + "2. Sum \n"
                + "3. Avg \n" + "4. Max \n" + "5. Min \n" + "6. Sort \n" + "7. Salir \n" + "\n"
                + "Que operacion desea realizar? ";
        //System.out.println(enunciado);

        int opcion_elegida = 0;
        do {
            System.out.println(enunciado);
            opcion_elegida = input.nextInt();

            switch (opcion_elegida) {
                case 1:
                    System.out.println("\n" + "Valores: " + IntegerArrayUtil.toString(array_ints) + "\n");
                    break;

                case 2:
                    System.out.println("\n" + "Valores: " + IntegerArrayUtil.toString(array_ints) + "\n");
                    System.out.println("La suma de todos los ints en el array es: " + IntegerArrayUtil.sum(array_ints) + "\n");
                    break;

                case 3:
                    System.out.println("\n" + "Valores: " + IntegerArrayUtil.toString(array_ints) + "\n");
                    System.out.println("El promedio de todos los ints en el array es: " + IntegerArrayUtil.avg(array_ints) + "\n");
                    break;

                case 4:
                    System.out.println("\n" + "Valores: " + IntegerArrayUtil.toString(array_ints) + "\n");
                    System.out.println("El valor del mayor int en el array es: " + IntegerArrayUtil.max(array_ints) + "\n");
                    break;

                case 5:
                    System.out.println("\n" + "Valores: " + IntegerArrayUtil.toString(array_ints) + "\n");
                    System.out.println("El valor del menor int en el array es: " + IntegerArrayUtil.min(array_ints) + "\n");
                    break;

                case 6:
                    System.out.println("\n" + "Valores: " + IntegerArrayUtil.toString(array_ints) + "\n");
                    System.out.println("El array ordenado en orden creciente es: " + IntegerArrayUtil.toString(IntegerArrayUtil.sort(array_ints)) + "\n");
                    break;

                default:
                    System.out.println("\n" + "Gracias por usar este programa!");
                    break;

            }

        } while (opcion_elegida != 7);
    }
}
