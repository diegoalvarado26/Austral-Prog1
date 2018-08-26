package Tp6.src.Cartelera;

/**
 * Clase cartel, que simula un mensaje en pantalla
 *
 * @author (Jorge Oribe)
 * @version (1.0)
 */
public class Cartel {
    //
    private String text;

    /**
     * Constructor de objetos de la clase Cartel
     */
    public Cartel(String s) {
        text = s;
    }

    /**
     * Método que permite modificar el texto del cartel
     *
     * @param nuevoTexto es el nuevo texto que mostrará¡ el cartel
     */
    public void setText(String newText) {
        text = newText;
    }

    /**
     * muestra en pantalla su texto mostrándolo del siguiente modo
     * *** textoCartel ***
     */
    public void print() {
        System.out.println("*** " + text + " ***");
    }

    /**
     * Método que retorna el String del texto
     *
     * @return el String de text
     */
    public String toString() {
        return text;
    }
}