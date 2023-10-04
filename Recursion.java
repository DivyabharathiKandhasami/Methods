
public class Recursion {
    public static void main(String[] agrs){
        int result;
        result = sum(70);
        System.out.println(result);
    }
    public static int sum(int k)
    {
        if(k > 0)
        {
            return k + sum(k-1);
        }
        else
        {
            return 0;
        }
    }
}




