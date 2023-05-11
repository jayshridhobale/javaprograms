package GreenZone;

import AnonymousClass.Student;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentData_store_MainApp {
    static Scanner s1=new Scanner(System.in);
    static StudentData_store_MainApp m1=new StudentData_store_MainApp();
    ArrayList<StudentData_Store_InArrayList> list=new ArrayList<>();
    public static void main(String[] args) {
        operation();


    }
        public static void operation() {
            System.out.println("1:Add Students");
            System.out.println("2:Swap Roll Numbers");
            System.out.println("3:Exit");
            System.out.println("Enter your choice");
            int choice = s1.nextInt();
            switch (choice) {
                case 1:
                    acceptDetails();
                    break;
                case 2:
                    swapData();
                    break;
                case 3:
                    System.out.println("Thank you for visiting");
                    System.exit(0);
                    break;

            }
        }


    public static void acceptDetails(){
            System.out.println("Enter Id");
            int id= s1.nextInt();
            System.out.println("Enter Name");
            String name=s1.next();
            System.out.println("Enter Marks");
            int marks=s1.nextInt();
            StudentData_Store_InArrayList sm1=new StudentData_Store_InArrayList(id,name,marks);
            m1.list.add(sm1);
            System.out.println("data Added successfully");
            System.out.println(m1.list);

        }
        public static void swapData(){
                System.out.println("Enter Student 1 name");
                String stud1=s1.next();
                System.out.println("Enter Student 2 name");
                String stud2=s1.next();

                int temp1=0,temp2=0;
                for (StudentData_Store_InArrayList std1:m1.list){
                    if(std1.getStud_name().equals(stud1)){
                        temp1= std1.getStud_id();
                    } else if (std1.getStud_name().equals(stud2)) {
                        temp2=std1.getStud_id();

                    }
                }
                int otemp=temp1;
                temp1=temp2;
                temp2=otemp;

            for(StudentData_Store_InArrayList std1:m1.list){
                if(std1.getStud_name().equals(std1)){
                    std1.setStud_id(temp1);
                } else if (std1.getStud_name().equals(stud2)) {
                    std1.setStud_id(temp2);
                }
            }

            System.out.println(m1.list);
        }


}
