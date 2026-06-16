import java.util.Random;

public class Arreglos {
    public static void main(String[] args) {

        Random random = new Random();

        int suma = 0;
        double promedio = 0.0;
        int[] numeros = {3, 5, 1, 5, 6, 2, 6};

        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
            suma += numeros[i];
        }

        System.out.println("La suma de los numeros es: " + suma);

        promedio = (double) suma / numeros.length;
        System.out.println("El promedio de los numeros es: " + promedio);

        int aleatorio = random.nextInt(numeros.length);
        int numeroSeleccionado = numeros[aleatorio];

        int mayores = 0;
        int menores = 0;
        for (int num : numeros) {
            if (num > numeroSeleccionado) {
                mayores++;
            } else if (num < numeroSeleccionado) {
                menores++;
            }
        }

        System.out.println("\nNumero seleccionado: " + numeroSeleccionado);
        System.out.println("Numeros mayores: " + mayores);
        System.out.println("Numeros menores: " + menores);
    }
}
