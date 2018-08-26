package Tp6.src.Cartelera;

/* Esta clase simula ser una cartelera
 * En primera instancia con posibilidad de 4 carteles
 *
 * @author (Jorge Oribe)
 * @version (1.0)
 */
public class Cartelera {
    // Definimos las variables de instancia de esta clase
    private Cartel[] carteles;

    /**
     * Constructor de objetos de la clase Cartelera
     * Crea una cartelera con n carteles sin texto (String vacio: "")
     */
    public Cartelera(int cantidad) {
        carteles = new Cartel[cantidad];

    }

    /**
     * Método que muestra la cartelera
     */
    public void mostrar() {
        for (int i = 0; i < carteles.length; i++) {
            System.out.println("*** " + carteles[i] + " ***");
        }
    }

    /**
     * modifica el texto de los carteles
     */
    public void modificaCarteles(String[] nuevosTextos) {
        for (int i = 0; i < carteles.length; i++) {
            carteles[i].setText(nuevosTextos[i]);
        }
    }

    /**
     * metodo que pone todos los carteles sin texto
     */
    public void borraCarteles() {
        for (int i = 0; i < carteles.length; i++) {
            carteles[i].setText(" ");
        }
    }

}