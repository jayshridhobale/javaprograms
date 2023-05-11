package ArraylistListFramwork;

public class Course {
    String courseName;
    String batchCode;

    public Course(String courseName, String batchCode) {
        this.courseName = courseName;
        this.batchCode = batchCode;

    }

    @Override
    public String toString() {
        return "Course{" +
                "courseName='" + courseName + '\'' +
                ", batchCode='" + batchCode + '\'' +
                '}';
    }
}
