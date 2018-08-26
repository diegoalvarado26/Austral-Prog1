package Tp6.src.Tp3;

import Tp6.src.Scanner.Scanner;

public class QuadraticTester {
    public static void main(String[] args) {
        System.out.println(" ");

        double a = Scanner.getDouble("Ingrese el coeficiente a: ");
        double b = Scanner.getDouble("Ingrese el coeficiente b: ");
        double c = Scanner.getDouble("Ingrese el coeficiente c: ");

        Quadratic quadratic_eq = new Quadratic(a, b, c);

        //a = 3, b = -11, c = 4;

        System.out.println(" ");

        System.out.println(quadratic_eq.roots());

        System.out.println(" ");


        double x = Scanner.getDouble("Ingrese un valor de x: ");

        System.out.println(" ");

        System.out.println(quadratic_eq.valueY(x));

        System.out.println(" ");

        System.out.println("Su funcion es: " + quadratic_eq.toString());

        System.out.println(" ");

        System.out.println("Su funcion derivada es: " + quadratic_eq.derivation());

    }
}
