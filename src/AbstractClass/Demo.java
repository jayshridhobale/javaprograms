package AbstractClass;
//Structure of an abstract class
public abstract class Demo {

    //Static and Non-static variables
    static int a=10;
    double b=20.35;

    //static and Non-static concrete Methods
    static void test(){
        System.out.println("static test Method");
    }

    void info(){
        System.out.println("non-static Info Method");
    }

    //Non-static Abstract method
    abstract void display();

    //static and Non-Static Block
    static {
        System.out.println("Static block");
    }
    {
        System.out.println("Non- static Block");
    }

    //Constructor

    Demo(){
        System.out.println("Constructor");
    }
}
