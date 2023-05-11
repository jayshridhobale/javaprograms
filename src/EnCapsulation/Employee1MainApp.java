package EnCapsulation;

public class Employee1MainApp {
    public static void main(String[] args) {
        Employee1 e1=new Employee1();
        System.out.println( e1.getEmpSalary());
        e1.setEmpSalary(2000.20);
        System.out.println(e1.getEmpSalary());
        e1.setEmpSalary(-300);
        System.out.println(e1.getEmpSalary());
    }
}
