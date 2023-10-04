public class Method1 {
    static void Sound() {
         System.out.println(" Meow");
    }
       static String Sound( String a )
       {
            a = " Meow";
            return a;
       }
        static void Sound( int i)
        {
        for( i=1; i<4; i++)
        {
          System.out.println( i+  "meow");
        }
        }
        public static void main(String[] agrs)
        {
            Sound();
            Sound();
            Sound();
        }
}
