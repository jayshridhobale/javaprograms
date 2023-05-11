package programing;

import java.util.Scanner;

public class Demo144 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter no");
        int no1=sc.nextInt();
        int temp=no1;

        for(int i=1;i<no1;i++)
        {
            temp=temp*i;

        }
        System.out.print(no1+" factorial is "+temp);
    }
}
