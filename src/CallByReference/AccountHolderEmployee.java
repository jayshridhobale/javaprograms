package CallByReference;

import java.util.Scanner;

public class AccountHolderEmployee {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name :");
        String name = sc.next();
        System.out.print("Enter the amount to be withdrawed : ");
        double amount = sc.nextDouble();

        AccountHolder acch = new AccountHolder();
        acch.acceptValues(name, amount);

        Employee e = new Employee();
        e.calculateAmount(new AccountHolder());
    }
}
