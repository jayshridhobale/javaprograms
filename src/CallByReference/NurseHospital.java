package CallByReference;

public class NurseHospital {
    public static void main(String[] args) {
        Hospital h1=new Hospital();
        h1.isWorking(new Nurse());
    }
}
