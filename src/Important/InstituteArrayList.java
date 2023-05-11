package Important;
//create an Array list of Institute and store five elements as ID name city number of
// standard number of courses and store object of them in the same arraylist and give
// the end user twice at Institute name ID whatever user will enter that field should be check in the
// arraylist is present in display particular Institute information as display Institute does not exist
import java.util.ArrayList;
import java.util.Scanner;

class Institute {
    int id;
    String name;
    String city;
    int numberOfStandards;
    int numberOfCourses;

    public Institute(int id, String name, String city, int numberOfStandards, int numberOfCourses) {
        this.id = id;
        this.name = name;
        this.city = city;
        this.numberOfStandards = numberOfStandards;
        this.numberOfCourses = numberOfCourses;
    }
}

public class InstituteArrayList {
    public static void main(String[] args) {
        ArrayList<Institute> institutes = new ArrayList<>();
        institutes.add(new Institute(1, "ABC Institute", "Delhi", 5, 15));
        institutes.add(new Institute(2, "XYZ Institute", "Mumbai", 6, 20));
        institutes.add(new Institute(3, "PQR Institute", "Bangalore", 7, 25));
        institutes.add(new Institute(4, "LMN Institute", "Hyderabad", 8, 30));
        institutes.add(new Institute(5, "UVW Institute", "Chennai", 9, 35));

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the field (name or ID) to search by: ");
        String field = scanner.nextLine();

        System.out.println("Enter the value to search for: ");
        String value = scanner.nextLine();

        boolean instituteFound = false;
        for (Institute institute : institutes) {
            if ((field.equals("name") && institute.name.equals(value)) ||
                    (field.equals("ID") && institute.id == Integer.parseInt(value))) {
                System.out.println("ID: " + institute.id);
                System.out.println("Name: " + institute.name);
                System.out.println("City: " + institute.city);
                System.out.println("Number of Standards: " + institute.numberOfStandards);
                System.out.println("Number of Courses: " + institute.numberOfCourses);
                instituteFound = true;
                break;
            }
        }

        if (!instituteFound) {
            System.out.println("Institute does not exist");
        }
    }
}

