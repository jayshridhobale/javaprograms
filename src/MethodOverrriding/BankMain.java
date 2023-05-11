package MethodOverrriding;

import java.util.Scanner;

public class BankMain {
    public static void main(String[] args) {
        Scanner s1=new Scanner(System.in);

        System.out.println("Select Bank:");
        System.out.println("1:SBI\n2:ICICI");
        int choice=s1.nextInt();

        System.out.println("Enter Amount:");
        double amount=s1.nextDouble();

        System.out.println("Enter Year");
        int year=s1.nextInt();

        if(choice==1){
            SBI s2=new SBI();
            s2.CalculateIntrest(amount,year);
        }
        else if(choice==2){
            ICICI i1=new ICICI();
            i1.CalculateIntrest(amount,year);
        }
        else{
            System.out.println("Invalid Choice");
        }
    }
}
