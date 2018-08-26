package Tp7;

public class StringListTester {
    public static void main(String[] args) {
        StringList lista = new StringList(5);
        lista.add("Hello");
        lista.add("World!");
        lista.add("Hmmm");

        System.out.println("La longitud del arreglo es de: " + lista.size() + " elemento/s.");
        System.out.println(lista.toString());
        System.out.println("Se encontró el elemento en el array, su índice es: " + lista.indexOf("Hmmm"));
        System.out.println("Ahora se procedera a eliminar el elemento en el índice 2.");
        lista.remove(2);
        System.out.println("El nuevo arreglo es: " + lista.toString());
        System.out.println("La longitud del nuevo arreglo es: " + lista.size());


    }
}
