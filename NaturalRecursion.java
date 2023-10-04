import java.util.Scanner;
public class NaturalRecursion {
    public static void main(String[] agrs){
        Scanner sc = new Scanner( System.in);
        int i = sc.nextInt();
        System.out.println("Enter a input number:");
        NaturalRecursion obj = new NaturalRecursion();
        obj.natural( i,1);
    }
    static int natural (   int n , int y) {
        if (n <= y) {
            System.out.println(n+ " ");
            return( natural( y, ++n) );
        }

        return 1;
    }
}

