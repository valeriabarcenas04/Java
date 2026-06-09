public class ejercicio3 {
   public ejercicio3() {
   }

   public static void main(String[] var0) {
      System.out.println("Números primos del 1 al 100:");

      for(int var1 = 2; var1 <= 100; ++var1) {
         if (esPrimo(var1)) {
            System.out.print(var1 + " ");
         }
      }

   }

   public static boolean esPrimo(int var0) {
      if (var0 <= 1) {
         return false;
      } else {
         for(int var1 = 2; (double)var1 <= Math.sqrt((double)var0); ++var1) {
            if (var0 % var1 == 0) {
               return false;
            }
         }

         return true;
      }
   }
}
