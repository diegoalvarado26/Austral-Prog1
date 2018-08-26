package Cartelera;

import Scanner.*;

/**
 * Una aplicación que usa una cartelera.
 * Para la presentación de métodos.
 *
 * @author (Jorge Oribe)
 * @version (20110512)
 */
public class AplicCartelera {
    public static void main(String[] args) {
        Cartelera c = new Cartelera(4);
        System.out.println();
        System.out.println("INICIO");
        System.out.println();

        c.mostrar();
        System.out.println();
        System.out.println("Se le pedirán los textos para los 4 carteles");
        String text1 = Scanner.getString("entre el texto del cartel 1: ");
        String text2 = Scanner.getString("entre el texto del cartel 2: ");
        String text3 = Scanner.getString("entre el texto del cartel 3: ");
        String text4 = Scanner.getString("entre el texto del cartel 4: ");
        String[] arrayModificar = new String[]{text1, text2, text3, text4};

        c.modificaCarteles(arrayModificar);
        System.out.println();
        c.mostrar();
        System.out.println();
        System.out.println("se borrarÃ¡n todos los textos de los carteles");
        c.borraCarteles();
        System.out.println();
        c.mostrar();
        System.out.println();
        System.out.println("FIN");
    }

}
