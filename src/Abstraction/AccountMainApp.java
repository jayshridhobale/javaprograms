package Abstraction;

import java.util.Scanner;

public class AccountMainApp {
    public static void main(String[] args) {
        Scanner s1=new Scanner(System.in);
        System.out.println("Select account type:");
        System.out.println("1:Saving Accoount\t\t2:Loan Account");
        int choice=s1.nextInt();
        System.out.println("Enter Account Opeining Balance");
        double balance=s1.nextDouble();
        //create object of AccountFactory
        AccountFactory factory=new AccountFactory();
       Account accRef=factory.createAccount(choice,balance);
        System.out.println("==========================");

        //transactionb
        boolean status=true;
        while(status){
            System.out.println("Select mode of transaction");
            System.out.println("1:deposit\n2:Withdraw\n3:CheckBalance\n4:Exit");
            int mode=s1.nextInt();
            switch (mode){
                case 1:System.out.println("Enter Amount");
                double depositAmt=s1.nextDouble();
                accRef.deposit(depositAmt);
                break;
                case 2:
                    System.out.println("Enter amount");
                    double withdrawAmt=s1.nextDouble();
                    accRef.withdraw(withdrawAmt);
                    break;
                case 3:accRef.checkBalance();
                case 4:
                    status=false;
                        }
                    }
                }
            }


