package AnonymousClass;

public interface Student {
    void studentInfo();
    void collegeInfo();
}
class Anonymous1{
    public static void main(String[] args) {
        Student s1=new Student() {
            @Override
            public void studentInfo() {
                String name="Jayshri";
                String colgName="JSPM";
                System.out.println("Student Name is :"+name);
                System.out.println("Student College is :"+colgName);
            }
            public void collegeInfo(){
                System.out.println("College University is SSPU");
            }
        };
        s1.studentInfo();
        s1.collegeInfo();
    }
}