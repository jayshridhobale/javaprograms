package Constructor;

class Laptop{
    String compnay;
    int ramsize;
    double graphisSize;

    public Laptop(String compnay, int ramsize, double graphisSize) {
        this.compnay = compnay;
        this.ramsize = ramsize;
        this.graphisSize = graphisSize;
    }
    public Laptop(String compnay, int ramsize) {
        this.compnay = compnay;
        this.ramsize = ramsize;
    }
    void display(){
        System.out.println(compnay+ "\t" +ramsize+ "\t" +graphisSize);
    }
}
public class ConstructorDemo6 {
    public static void main(String[] args) {
        Laptop l1=new Laptop("LINIO",256,2.5);
        l1.display();
        Laptop l2=new Laptop("Acer",256);
        l2.display();

    }


}
