package Constructor;
class Democonstruct{
    Democonstruct(int a){                  //Parameterised Constructor
        System.out.println("USerDefined Constructor");
        System.out.println("A value is "+a);
    }
    void test(){
        System.out.println("Test Method");
    }
}
public class ConstructorDemo2 {
    public static void main(String[] args) {
        Democonstruct d1=new Democonstruct(10);
        d1.test();

    }
}
