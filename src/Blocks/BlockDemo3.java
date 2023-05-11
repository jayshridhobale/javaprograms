package Blocks;


class Central{
    static double d=10.25;

    static {
        d=35.25;
    }
    static {
        double d=50.25;
        System.out.println("D value is:"+d);
    }
}
public class BlockDemo3 {
    public static void main(String[] args) {
        System.out.println("Main Method");
        System.out.println("value is:"+Central.d);
    }
    static {
        System.out.println("Static Method");
    }
}
