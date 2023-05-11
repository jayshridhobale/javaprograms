package programing;

import java.util.Scanner;

public class Demo143 {
    public static void main(String[] args) {
        Scanner sc1=new Scanner(System.in);
        System.out.println("enter first no. ");
        int a=sc1.nextInt();
        System.out.println("enter second no.");
        int b= sc1.nextInt();

        System.out.println("enter range.");
        int range=sc1.nextInt();

        System.out.print(a+"\t"+b+"\t");

        for(int i=2;i<=range;i++)
        {
            a=a+b;
            b=a-b;
            a=a-b;
            System.out.print(a+"\t"+b+"\t");

        }

    }
}
