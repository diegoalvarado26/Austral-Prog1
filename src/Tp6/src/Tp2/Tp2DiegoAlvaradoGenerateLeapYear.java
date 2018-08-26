package Tp6.src.Tp2;

import Tp6.src.Scanner.Scanner;

public class Tp2DiegoAlvaradoGenerateLeapYear {
    public static void main(String[] args) {
        System.out.println(" ");
        int year = Scanner.getInt("Ingrese un ano: ");


        if (isLeapYear(year)) {
            System.out.println("El ano que ingreso es bisiesto.");
        } else {
            System.out.println("El ano que ingreso no es bisiesto.");
        }

    }

    public static boolean isLeapYear(int year) {
        if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)) {
            return true;
        } else {
            return false;
        }

    }

}
