package NumbersString;

import java.util.Scanner;

public class CounterString {
    public static void main(String[] args) {
        Scanner sc1=new Scanner(System.in);
        System.out.println("enter number");
        int a=sc1.nextInt();
        System.out.println("enter second number");
        double b=sc1.nextDouble();
        System.out.println("enter sentence");
           sc1.nextLine();
        String c=sc1.nextLine();

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }

}
