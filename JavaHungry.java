public class JavaHungry {
    public static void main(String[] agrs) {
        System.out.println(" Calling main() method");
        // calling main function method.
        main("Inside actual main() method");
    }

    public static void main(String s) {
        System.out.println("Inside main() overloaded method.");

    }
}
