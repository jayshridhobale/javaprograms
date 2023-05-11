package ConstructorCall;

public class Test extends Demo{

    Test(double d){
        this('S');
        System.out.println(d);
    }

    Test(char c){
        super(10);
        System.out.println(c);
    }
}
