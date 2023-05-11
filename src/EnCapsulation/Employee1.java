package EnCapsulation;

public class Employee1 {       //Java beans
    private double empSalary = 15000.25;

    public double getEmpSalary() {
        return empSalary;
    }

    public void setEmpSalary(double empSalary) {
        if (empSalary > 0) {
            this.empSalary = empSalary;
        } else {
            System.out.println("Invalid Salary amount");
        }
    }
}
