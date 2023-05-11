package ObjectClass;

public class EmployeeMain {
    public static void main(String[] args) {
        Employee e1=new Employee(101,20000.35,"Jayshri");
        System.out.println(e1);
        Employee e2=new Employee(102,25000.35,"Akshada");
        System.out.println(e2.toString());
        e1.empId=201;
        System.out.println(e1.empId);
        System.out.println(e1.getClass());  //getclass

    }
}
