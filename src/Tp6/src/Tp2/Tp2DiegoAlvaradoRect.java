package Tp6.src.Tp2;

import Tp6.src.Scanner.Scanner;

public class Tp2DiegoAlvaradoRect {
    public static void main(String[] args)

    {
        System.out.println(" ");

        System.out.println("Ingrese el coeficiente A de su ecuacion de la recta:");
        double a_coef = Scanner.getDouble("");
        System.out.println(" ");

        System.out.println("Ingrese el coeficiente B de su ecuacion de la recta:");
        double b_coef = Scanner.getDouble("");
        System.out.println(" ");

        System.out.println("Ingrese la coordenada X1 del primer punto:");
        double x1 = Scanner.getDouble("");
        System.out.println(" ");

        System.out.println("Ingrese la coordenada X2 del primer punto:");
        double x2 = Scanner.getDouble("");
        System.out.println(" ");

        double y1 = calculateY(a_coef, b_coef, x1);
        double y2 = calculateY(a_coef, b_coef, x2);


        System.out.println("***************************************************");
        System.out.println(" ");

        System.out.println("Para la siguiente ecuacion: ");
        System.out.println("\t Y = " + a_coef + "X" + " + " + b_coef);
        System.out.println(" ");

        System.out.println("Dados los siguientes puntos: ");
        System.out.println("\t P1 " + "(" + x1 + ", " + y1 + ")");
        System.out.println("\t P2 " + "(" + x2 + ", " + y2 + ")");
        System.out.println(" ");
        System.out.println("La distancia entre ellos es: " + distance(x1, y1, x2, y2));

        System.out.println(" ");
        System.out.println("***************************************************");


    }

    public static double calculateY(double a, double b, double x) {
        double resultado_y = (a * x + b);
        return resultado_y;


    }

    public static double distance(double x1, double y1, double x2, double y2) {
        double x = (x2 - x1);
        double y = (y2 - y1);
        double modulo = Math.sqrt(Math.pow(x, 2.0) + Math.pow(y, 2.0));
        return modulo;
    }
}
