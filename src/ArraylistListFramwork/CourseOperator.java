package ArraylistListFramwork;

import java.util.ArrayList;
import java.util.Iterator;

public class CourseOperator {
    ArrayList<Course> courses = new ArrayList<>();
    public void add(){
        
    }

    public void addCourse(String course, String code) {
        Course s1=new Course(course,code);
        courses.add(s1);
        System.out.println("Course Added Sucsessfully");
        
    }
    public void displayCourse(){
        System.out.println("Course\t\tBatchcode");
        System.out.println("===================");
        for( Course c:courses){
            System.out.println(c);
        }
    }

    public void deleteCourse(String code) {
        Iterator<Course> itr=courses.iterator();
        boolean found=false;
        while (itr.hasNext()){
            Course c=itr.next();
            if(c.batchCode.equals(code)){
                itr.remove();
                System.out.println("course deleted sucessfully");
                found=true;
            }
        }
        if(!found){
            System.out.println("Invalid Batchcode");
        }
    }
}
