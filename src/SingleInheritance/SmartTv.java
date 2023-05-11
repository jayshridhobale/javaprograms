package SingleInheritance;

public class SmartTv extends  Tv{
    double qty=20;
    double price=500000.4;
    void display(){
        System.out.println("Price "+price);
        System.out.println("Quanty "+qty);
        System.out.println("Quantity of super:"+super.qty);
        System.out.println("Price of Super: "+super.price);
    }


}
