import java.util.Scanner;
public class AreaOfCircle {
     static int Area( int r,int b )
     {
        b = (22*r*r)/7;
         System.out.println("Area of circle is:" +b);

         return( b);
     }


    public static void main(String[] agrs)
    {
        Area(9, 1);
    }
}
