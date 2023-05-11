package MethodOverloading;

import java.util.Scanner;

public class MainApp1 {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        Facebook f1 = new Facebook();

        System.out.println("Select login method");
        System.out.println("1:Logon by username and password");
        System.out.println("2:login by contact and password");
        int choice = s1.nextInt();

        if (choice == 1) {
            System.out.println("Enter Username:");
            String user = s1.next();

            System.out.println("Enter password:");
            String pass = s1.next();
            f1.login(user, pass);

        }
        if (choice == 2) {
            System.out.println("Enter Contact:");
            String con = s1.next();

            System.out.println("Enter password:");
            String pass = s1.next();
            f1.login(con,pass);
        }
    }
}
