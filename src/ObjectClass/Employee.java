package ObjectClass;

public class Employee {
    int empId;
    double empSal;
    String empDesignation;

    public Employee(int empId,double empSal,String empDesignation){
        this.empId=empId;
        this.empSal=empSal;
        this.empDesignation=empDesignation;
    }
    public String toString()
    {
        return empId+"\t"+empSal+"\t"+empDesignation;
    }
}
