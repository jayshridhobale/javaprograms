package Blocks;

public class BlockDemo5 {

    static int a = 10;
    static int b = 20;

    static {
        System.out.println(a + b);
        b++;
    }

    {
        System.out.println(a + b);
        a++;
    }


    public static void main(String[] args) {
        System.out.println("Main MEthod");
        BlockDemo5 b1 = new BlockDemo5();
        BlockDemo5 b2 = new BlockDemo5();

        System.out.println("A valuse is :" + a);
        System.out.println("A valuse is :" + b);


    }

}
