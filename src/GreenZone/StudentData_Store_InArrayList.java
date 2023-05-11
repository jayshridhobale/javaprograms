package GreenZone;

public class StudentData_Store_InArrayList {
    private int stud_id;
    private String stud_name;
    private int stud_mark;

    public StudentData_Store_InArrayList(int stud_id, String stud_name, int stud_mark) {
        this.stud_id = stud_id;
        this.stud_name = stud_name;
        this.stud_mark = stud_mark;
    }

    public int getStud_id() {
        return stud_id;
    }

    public void setStud_id(int stud_id) {
        this.stud_id = stud_id;
    }

    public String getStud_name() {
        return stud_name;
    }

    public void setStud_name(String stud_name) {
        this.stud_name = stud_name;
    }

    public int getStud_mark() {
        return stud_mark;
    }

    public void setStud_mark(int stud_mark) {
        this.stud_mark = stud_mark;
    }

    @Override
    public String toString() {
        return "StudentData_Store_InArrayList{" +
                "stud_id=" + stud_id +
                ", stud_name='" + stud_name + '\'' +
                ", stud_mark=" + stud_mark +
                '}';
    }


}
