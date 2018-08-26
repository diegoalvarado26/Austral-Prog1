package Tp6.src.Tp2;

import Tp6.src.Scanner.Scanner;

public class Tp2DiegoAlvaradoGenerateKey {
    public static void main(String[] args) {

        System.out.println(" ");

        System.out.println("Si su apellido o nombre tiene menos de 3 letras, por favor rellenar con una 'a'. Caso contrario, habra un error en la generacion de la clave.");

        System.out.println(" ");

        System.out.println("Ingrese su apellido: ");
        String apellido = Scanner.getString(" ");
        String apellido_lower = apellido.toLowerCase();

        System.out.println(" ");

        System.out.println("Ingrese su nombre: ");
        String nombre = Scanner.getString(" ");
        String nombre_lower = nombre.toLowerCase();

        char apellido1 = apellido_lower.charAt(0);

        int apellido1_char = (int) apellido1;

        System.out.println(" ");

        if (apellido1_char < 109) {
            System.out.println(" La primera letra de su apellido se encuentra antes de la m");
        } else if (apellido1_char == 109) {
            System.out.println(" La primera letra de su apellido es la m");
        } else {
            System.out.println(" La primera letra de su apellido se encuentra despues de la m");
        }
        System.out.println(" ");

        String apellido_clave = apellido.substring(0, 3);

        String nombre_clave = nombre_lower.substring((nombre.length() - 3), nombre.length());

        System.out.println(" Su clave es: " + apellido_clave + nombre_clave);


    }
}
