package Variables;
import java.util.Scanner;
public class VariableDemo3 {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
            System.out.println("Eneter the no");
            double no1 = s1.nextDouble();
            System.out.println("Eneter the integer");
             int no2 = s1.nextInt();
            System.out.println("Eneter the string");
            s1.nextLine();
            String no3 = s1.nextLine();

        System.out.println("double value is:"+no1);
        System.out.println("integer value is:"+no2);
        System.out.println("String value is:"+no3);
    }
}
