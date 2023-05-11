package ObjectComposition;

public class StudentCourseMain {
    public static void main(String[] args) {


        Student s1 = new Student();
        s1.study();
        s1.c1.inRoll();
        s1.c1.notInRoll();
    }
}
