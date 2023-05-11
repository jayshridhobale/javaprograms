package Constructor;

class Employee{
    String name;
    float percentage;
    long contact;
    Employee(String n,float p,long c){
        name=n;
        percentage=p;
        contact=c;
    }
    void display(){
        System.out.println(name+ "\t" +percentage+ "\t" +contact);
    }

}
public class ConstructorDemo4 {
    public static void main(String[] args) {
        Employee e1=new Employee("jayu",85.34f,9823786532l);
        e1.display();

    }
}
