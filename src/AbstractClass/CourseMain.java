package AbstractClass;

public class CourseMain {
    public static void main(String[] args) {


        //upcasting
        Course c1;

        c1=new Development();
        c1.getSyllabus();

        c1=new Testing();
        c1.getSyllabus();
    }
}
