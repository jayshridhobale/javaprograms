package Constructor;
class ConstructorDemo{
    ConstructorDemo(){    //Default Constructor

    }
    void  test(){
        System.out.println("Test Method");
    }
}
 class ConstructorDemo1 {
    public static void main(String[] args) {
        ConstructorDemo d1=new ConstructorDemo();
        d1.test();
    }
}
