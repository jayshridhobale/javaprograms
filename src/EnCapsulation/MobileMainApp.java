package EnCapsulation;

public class MobileMainApp {
    public static void main(String[] args) {
        Mobile m1=new Mobile();
        Mobile.Processer mp=m1.new Processer();
        System.out.println(mp.proName);

        Mobile.RamSize mr=m1.new RamSize();
        System.out.println(mr.ramSize);
    }
}
