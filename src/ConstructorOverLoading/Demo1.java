package ConstructorOverLoading;

public class Demo1 {
    public Demo1(int a) {

        System.out.println("Integer value is:"+a);

    }

    public Demo1(boolean b ) {
            this(10);
        System.out.println("Boolean value is:"+b);
    }

    public Demo1(float c) {
        this(true);
        System.out.println("Float value is:"+c);
    }
}
