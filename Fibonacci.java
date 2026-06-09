public class ejercicio2 {
    public static void main(String[] args) {
        long a = 1;
        long b = 1;
        for (int i = 1; i <= 50; i++) {
            System.out.println(a+" ");
            long c = a + b;
            a = b;
            b = c;
        }
    }
}
