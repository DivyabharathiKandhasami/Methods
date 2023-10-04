public class MethodsBoxVolume {
    static int Boxvolume( int length, int breath,int width) {
        int vol= length * breath * width;
         return vol;
    }
    static void Printline()
    {
        System.out.println("_________________________________________________");
    }
    public static void main(String[] agrs) {
        Printline();
        System.out.println( Boxvolume( 40,80,76));
        System.out.println( Boxvolume( 60,40,32));
        System.out.println( Boxvolume( 80,20,54));
        System.out.println( Boxvolume( 90,60,68));
        Printline();
    }
}
