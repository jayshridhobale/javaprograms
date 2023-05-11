package CallByReference;

public class StudentCollegeReferenceVariable {

    public static void main(String[] args) {
        College c = new College();
        //option 1
        c.getResult(new Student());

        System.out.println();
        //option 2
        Student s1= new Student();
        c.getResult(s1);
    }
}
