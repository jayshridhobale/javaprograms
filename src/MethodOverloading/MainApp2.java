package MethodOverloading;

import java.util.Scanner;

public class MainApp2 {
    public static void main(String[] args) {
        Scanner s1=new Scanner(System.in);
        Flipkart f1=new Flipkart();
        System.out.println("Enter a Amout:");
        int amount=s1.nextInt();
        System.out.println("Select Payment Method:");
        System.out.println("1:Paymet Using Card:");
        System.out.println("2:Payement using Upi");
        int choice=s1.nextInt();

        if(choice==1){
            System.out.println("Enter cardno");
            int cno=s1.nextInt();

            System.out.println("Enetr CVV no:");
            int cvv=s1.nextInt();
            f1.payment(cno,cvv,amount);
        }
        if(choice==2){
            System.out.println("Enter UPI no");
            int upi=s1.nextInt();
            f1.payment(upi,amount);
        }
    }



}
