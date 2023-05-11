package ArrayOneD;

import java.util.Scanner;

public class Product {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ProductSimulator ps = new ProductSimulator();
        System.out.println("Select product :");
        System.out.println("0.MOBILE\n1.WATCH\n2.TV");
        int choice = sc.nextInt();
        System.out.print("Enter number of units : ");
        int quantity = sc.nextInt();

        ps.calculateBill(choice, quantity);

    }
}
