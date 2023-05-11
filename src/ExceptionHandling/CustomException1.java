package ExceptionHandling;
import java.util.Scanner;
public class CustomException1 extends Exception {
    public static void main(String[] args) throws InvalidEmailException {
        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter Email Id");
        String email = s1.next();
        validation(email);
    }
    static void validation(String email) throws InvalidEmailException {
       if (email.contains("@") && email.contains(".")) {
          System.out.println("Email id is valid ");
        } else {
            throw new InvalidEmailException("Invalid Email id");
        }
    }
}
