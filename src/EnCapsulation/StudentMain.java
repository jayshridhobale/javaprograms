package EnCapsulation;

public class StudentMain {
    public static void main(String[] args) {
        Student s1=new Student();
        s1.setStuName("Jayshri");
        String name=s1.getStuName();
        System.out.println("Name is " + name);
        System.out.println("=================");
        s1.setRollNo(101);
        int roll=s1.getRollNo();
        System.out.println("roll number is  " + roll);
    }
}
