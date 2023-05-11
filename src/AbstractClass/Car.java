package AbstractClass;

public abstract class Car {
    String [] models={"Manual","Automation"};
    String [] services={"Free Services","Paid Services"};
    abstract void bookService(int model,int serviceType);

}
