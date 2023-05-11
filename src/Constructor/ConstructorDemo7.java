package Constructor;
class Mobile{
    String compnay;
    int ramsize;
    double price;
    String color;

    public Mobile(String compnay, int ramsize, double price, String color) {
        this.compnay = compnay;
        this.ramsize = ramsize;
        this.price = price;
        this.color = color;
    }

    public Mobile(String compnay, int ramsize, double price) {
        this.compnay = compnay;
        this.ramsize = ramsize;
        this.price = price;
    }
    void display(){
        System.out.println(compnay+ "\t" +ramsize+ "\t" +price+ "\t" +color);
    }
}
public class ConstructorDemo7 {
    public static void main(String[] args) {

        Mobile m1= new Mobile("VIVO",256,20000.32,"Pink");
         m1.display();
        Mobile m2= new Mobile("MI",128,30000.30);
        m2.display();

    }
}
