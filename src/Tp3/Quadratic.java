package Tp3;

public class Quadratic {
    public double a;
    public double b;
    public double c;

    public Quadratic(double a_1, double b_1, double c_1) {
        a = a_1;
        b = b_1;
        c = c_1;
    }
//_________________________________________________________________________________

    public String roots() //Devuelve un string
    {
        double x_1 = (-b + Math.sqrt(Math.pow(b, 2) - 4.0 * a * c)) / 2.0 * a;
        double x_2 = (-b - Math.sqrt(Math.pow(b, 2) - 4.0 * a * c)) / 2.0 * a;

        double discriminante = (Math.pow(b, 2) - 4 * a * c);

        if (discriminante < 0) {
            return "No hay raices reales";
        } else if (discriminante == 0) {
            return "La funcion tiene dos raices iguales: (" + x_1 + ")";
        } else {
            return "La funcion tiene dos raices: (" + x_1 + ",  " + x_2 + ")";
        }

    }

//_____________________________________________________________________________________

    public String valueY(double x_nueva) //devuelve valor de Y para una X
    {
        double y_calc = a * Math.pow(x_nueva, 2) + b * x_nueva + c;
        return "El valor calculado de y para el valor de x ingresado es " + y_calc;
    }

//_______________________________________________________________________________________________

    public String valueX(double y_nueva) //devuelve valor de X para un Y
    {
        double c_v2 = (c - y_nueva);
        double x_calc;

        double x_1 = (-b + Math.sqrt(Math.pow(b, 2) - 4.0 * a * c_v2)) / 2.0 * a;
        double x_2 = (-b - Math.sqrt(Math.pow(b, 2) - 4.0 * a * c_v2)) / 2.0 * a;

        double discriminante_calcX = (Math.pow(b, 2) - 4 * a * c_v2);

        if (discriminante_calcX < 0) {
            return "No hay raices reales para ese valor de y";
        } else if (discriminante_calcX == 0) {
            return "La funcion tiene dos raices iguales para ese valor de y: (" + x_1 + ")";
        } else {
            return "La funcion tiene dos raices para ese valor de y: (" + x_1 + ", " + x_2 + ")";
        }
    }

//____________________________________

    public void setA(double a_nueva) {
        a = a_nueva;
    }

    public void setB(double b_nueva) {
        b = b_nueva;
    }

    public void setC(double c_nueva) {
        c = c_nueva;
    }

//_____________________________________________________________

    public String toString() {
        String valor_Y = "Y = " + a + "x^2 + " + b + "x + " + c;
        return valor_Y;
    }

    public String derivation() {
        String derivada = "dy/dx= " + 2 * a + "x + " + b;
        return derivada;
    }
}
