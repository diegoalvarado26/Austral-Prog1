package Tp1;

public class Tp1DiegoAlvaradoChange {
    public static void main(String[] args) {
        double gasto, dinero_recibido, vuelto;
        int resta, resta_decimales;

        gasto = 89.08;
        dinero_recibido = 100;

        vuelto = dinero_recibido - gasto;
        System.out.println("Ingresar gasto:   " + gasto);
        System.out.println("Dinero recibido:  " + dinero_recibido);

        System.out.println();

        System.out.println("Vuelto");
        resta = (int) (vuelto);
        System.out.println(" Pesos:     " + resta);
        resta_decimales = (int) ((vuelto - resta) * 100);
        System.out.println(" Centavos:  " + resta_decimales);
    }
}
