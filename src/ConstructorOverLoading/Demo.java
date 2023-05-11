package ConstructorOverLoading;

public class Demo {
    Demo(int a){
        this('J');
        System.out.println("a: "+a);
    }
    Demo(char c){
        this("Java");
        System.out.println("c: "+c);

    }
    Demo(String s){
        System.out.println("S "+s);
    }

}
