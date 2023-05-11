package ComparatorInterface;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class EmployeeMain {
    public static void main(String[] args) {
        ArrayList<Employee> data=new ArrayList<>();
        data.add(new Employee(10,"jayu",50000.43));
        data.add(new Employee(20,"shubham",50000.43));
        data.add(new Employee(20,"gokul",50000.43));


        SortedEmployee s1=new SortedEmployee();
        Collections.sort(data,new SortedEmployee());


        for (Employee values:data){
            System.out.println(values);
        }
        //reverse order object format data
        Collections.sort(data,Collections.reverseOrder());
        for (Employee values:data){
            System.out.println(values);
        }

    }
}
