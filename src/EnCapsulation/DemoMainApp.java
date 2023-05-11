package EnCapsulation;

public class DemoMainApp {
    public static void main(String[] args) {
        Demo d1=new Demo();
        System.out.println(d1.getEmpSal());
        System.out.println(d1.getEmpId());
        d1.setEmpId(202);
        d1.setEmpSal(40000.43);
        System.out.println(d1.getEmpId());
        System.out.println(d1.getEmpSal());
    }
}
