package EnCapsulation;
public class LaptopMainApp {
    public static void main(String[] args) {
        Laptop1 l1=new Laptop1();
        System.out.println("compnay name is "+l1.company);
        Laptop1.Rom r1=l1.new Rom();
        r1.displayRamInfo();
        System.out.println("===========================================");
        Laptop1.HardDisk h1=l1.new HardDisk();
        h1.displayHardDisk();
    }
}
