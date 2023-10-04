public class MethodsIf {
    static void Mycheck(int b) {
        if (b < 18) {
            System.out.println("Access Denied, You are not old enough");
        } else if (b >= 20) {
            System.out.println("Access Granted, you are elegible");
        } else {
            System.out.println(" your accessed are denied.");
        }
    }

    public static void main(String[] agrs) {
        Mycheck(21);
    }
}
