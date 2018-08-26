package Tp1;

public class Tp1DiegoAlvaradoMaths {
    public static void main(String[] args) {

        int i1, i2, i3;
        int div_int, div_remainder;
        double real_division;


        i1 = 31;
        System.out.println("El valor del primer numero entero (i1) es " + i1);

        i2 = 5;
        System.out.println("El valor del segundo numero entero (i2) es " + i2);

        i3 = i1 + i2;
        System.out.println("La suma de ambos numeros (i1 + i2) es " + i3);
        i3 = i1 - i2;
        System.out.println("La diferencia entre ambos numeros (i1 - i2) es " + i3);
        i3 = i1 * i2;
        System.out.println("El producto de ambos numeros (i1 x i2) es " + i3);
        i3 = (i1 + i2) / 2;
        System.out.println("El promedio de ambos numeros es " + i3);


        div_int = (int) (i1 / i2);
        System.out.println("El cociente entero entre ambos numeros (i1/i2) es " + div_int);
        div_remainder = (i1 % i2);
        System.out.println("El resto de la division entera (i1/i2) es " + div_remainder);
        real_division = (double) i1 / i2;
        System.out.println("El valor real de la division entre ambos numeros (i1/i2) es " + real_division);

        System.out.println(" ");

        System.out.println("Estas operaciones aplican para todo numero entero");
    }
}
