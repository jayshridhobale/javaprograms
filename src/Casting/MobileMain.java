package Casting;

public class MobileMain {
    public static void main(String[] args) {
        Mobile m1 ;                        //upcasting -its taking the genral information
        m1=new SmartPhone();
        m1.getInfo("SamgSung",20000.29);

        m1=new FeaturePhone();
        m1.getInfo("Nokia",2500.98);

        System.out.println("===================================");

        SmartPhone s1=new SmartPhone();           //Its taking the MAtching information using the same class object and refernce
        s1.specifications();

        FeaturePhone f1=new FeaturePhone();
        f1.specification();

    }
}
