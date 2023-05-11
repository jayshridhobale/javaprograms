package EnCapsulation;

public class Student {
    private String stuName;
    private int rollNo;
    public String getStuName(){
        return stuName;
    }
    public void setStuName(String stuName){
        this.stuName=stuName;
    }
    public int getRollNo(){
        return rollNo;
    }
    public void setRollNo(int rollNo){
        this.rollNo=rollNo;
    }
}
