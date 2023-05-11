package Blocks;

public class BlockDemo2 {
    static int a=65;
    static int b=75;

    static {
        System.out.println(a+b);
    }
    static {
        a=40;
        System.out.println(a+b);
    }
    public static void main(String[] args) {
        System.out.println("main Method");

    }
}
