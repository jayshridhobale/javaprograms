package String;

import java.util.Scanner;

public class StringDemo1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Double value : ");
        double d=sc.nextDouble();
        System.out.println("Enter Integer value : ");
        int i=sc.nextInt();
        System.out.println("Enter String value : ");
        sc.nextLine();
        String str= sc.nextLine();

        System.out.println("Double Value is  : " + d);
        System.out.println("Integer Value is  : " + i);
        System.out.println("String Value is  : " + str);
    }
}
