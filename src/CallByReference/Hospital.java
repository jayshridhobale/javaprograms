package CallByReference;

public class Hospital {
    void isWorking(Nurse n){
        System.out.println("Nurse id is:"+n.id);
        System.out.println("Nurse salary is:"+n.salay);
        System.out.println("Nurse shift is:"+n.shift);
        System.out.println("nurse woking is a rotational shift");
    }
}
