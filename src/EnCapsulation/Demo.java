package EnCapsulation;

public class Demo {       //Java Bean Class
    private int empId=101;  //java Bean class
    private double empSal=20000.32;

    public int getEmpId(){
        return empId;
    }
    public void setEmpId(int id){
        this.empId=id;
    }

    public double getEmpSal() {
        return empSal;
    }

    public void setEmpSal(double empSal) {
        this.empSal = empSal;
    }
}
