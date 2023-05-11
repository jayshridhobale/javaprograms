package programing;

import java.util.Scanner;

public class Demo145 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter no");
        int no1=sc.nextInt();
       int num=no1;
       int temp=0,rev=0;
       while (no1>0)
       {
           temp=no1%10;
           rev=rev*10+temp;
           no1=no1/10;
       }
        System.out.println("=========================");
        System.out.println(rev);



    }
}
