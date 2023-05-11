package Casting;

public class MachineLaptopMAin {
    public static void main(String[] args) {

        Machine m1=new Laptop();    //UPcasting
        m1.getType();


       Laptop l1= (Laptop) m1;
       l1.getType();
       l1.specification("Acer",25000.25);

    }
}
