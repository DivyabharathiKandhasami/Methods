public class Factorial {
     public static void main(String[] agrs)
     {
         int num = 6;
         long fact = multiplyNumber( num);
         System.out.println("Factorial of"   +num+   "="     +fact);
     }
      public static long multiplyNumber(int num) {
          if (num >= 1) {
              return num * multiplyNumber(num - 1);
          } else {
              return 1;

          }
      }

}



