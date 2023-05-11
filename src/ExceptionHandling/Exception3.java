package ExceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception3 {
    public static void main(String[] args) {
        Scanner s1=new Scanner(System.in);
        try{
        System.out.println("Enter first no:");
        int no1=s1.nextInt();
        System.out.println("Enter second no:");
        int no2=s1.nextInt();
        int result=no1/no2;
        System.out.println(result);
        }
        catch (ArithmeticException a){
            System.out.println(a);
        }
        catch (InputMismatchException i){
            System.out.println(i);
        }
    }
}
