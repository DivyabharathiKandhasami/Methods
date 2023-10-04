public class MethodOverLoding {
     static  int Mymethod( int a, int b)
     {
         return a+b;
     }
     static double Mymethod( double x , double y )
     {
          return x+y;
     }
       public static void main(String [] agrs)
       {
          int num1 =  Mymethod(5,6);
          double num2= Mymethod(9.8,4.5);
          System.out.println("int :" +num1);
           System.out.println("Double:"+num2 );
       }
}
