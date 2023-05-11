package ArraylistListFramwork;


import java.util.ArrayList;

public class LaptopMain {
    public static void main(String[] args) {
        Laptop l1=new Laptop(30000.25,"hp");
        Laptop l2=new Laptop(40000.35,"Acer");
        Laptop l3=new Laptop(50000.45,"Lenovo");
        ArrayList<Laptop> data=new ArrayList<>();
         data.add(l1);
         data.add(l2);
         data.add(l3);
         for(Laptop l:data){
             System.out.println(l);
         }
    }
}
