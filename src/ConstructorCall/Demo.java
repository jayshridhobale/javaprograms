package ConstructorCall;

public class Demo {
    Demo(int a){
        this("sb");
        System.out.println(a);
    }

    Demo(String s){
        System.out.println(s);
    }
}
