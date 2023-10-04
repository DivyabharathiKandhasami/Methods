public class Method2 {
    static void show(String name ) {
        System.out.println(name + " bharathi");
    }
    static void show ( int i)
    {
        System.out.println(i);
    }
    public class Test {
        public static void main(String[] agrs) {
            Method2 n = new Method2();
            n.show("Divya");
            n.show(6);
        }

    }
}
