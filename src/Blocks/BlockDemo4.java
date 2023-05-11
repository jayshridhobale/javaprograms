package Blocks;

public class BlockDemo4 {
    static {
        System.out.println("Static block");
    }

    public static void main(String[] args) {
        System.out.println("main Method");
        BlockDemo4 b1 = new BlockDemo4();
        BlockDemo4 b2 = new BlockDemo4();
        BlockDemo4 b3 = new BlockDemo4();
    }
        {
            System.out.println("non static Block");
        }


}