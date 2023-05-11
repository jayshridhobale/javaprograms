package ArraylistListFramwork;

import java.util.Scanner;


public class CourseMain {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        CourseOperator opetations = new CourseOperator();
        boolean status=true;
        while(status){
        System.out.println("1:Add Course");
        System.out.println("2:Delete Course");
        System.out.println("3:Display Course");
        System.out.println("4:Exit");
        int choice = s1.nextInt();
        if (choice == 1) {
            System.out.println("Enter course name");
            String course = s1.next();
            System.out.println("Enter Batchcode");
            String code = s1.next();
            opetations.addCourse(course, code);
        } else if (choice == 2) {
            opetations.displayCourse();
        } else if (choice==3) {
            System.out.println("Enter batch code");
            String code = s1.next();
            opetations.deleteCourse(code);
        }
        else {
            status=false;
        }
        }
    }
}