public class Funciones {
    public static void saludo() {
        System.out.println("¡Hola amigo!");
    }

    public static void saludarNombre(String nombre) {
        System.out.println("¡Hola " + nombre + "!");
    }

    public static long factorial(int n) {
        long resultado = 1;

        for (int i = 1; i <= n; i++) {
            resultado *= i;
        }
        return resultado;
    }

    public static double calcularFactura(double cantidad) {
        return cantidad * 1.21;
    }

    public static double calcularFactura(double cantidad, double iva) {
        return cantidad + (cantidad * iva / 100);
    }

    public static double areaCirculo(double radio) {
        return Math.PI * (radio * radio);
    }

    public static double volumenCilindro(double radio, double altura) {
        return areaCirculo(radio) * altura;
    }
}
