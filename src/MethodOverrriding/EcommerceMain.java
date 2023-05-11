package MethodOverrriding;

import java.util.Scanner;

public class EcommerceMain {
    public static void main(String[] args) {
        Scanner s1=new Scanner(System.in);
        System.out.println("Select Platform:");

        System.out.println("1:Amazon\n2:Flipkart");
        int choice=s1.nextInt();

        System.out.println("Enter Quantity:");
        int qty=s1.nextInt();

        System.out.println("Enter Price:");
        double price=s1.nextDouble();

        if(choice==1){
            Amazon a1=new Amazon();
            a1.sellProduct(qty,price);

        }
        else if(choice==2){
            Flipkart f1=new Flipkart();
            f1.sellProduct(qty,price);
        }
        else{
            System.out.println("Invalid Choice");
        }
    }
}
