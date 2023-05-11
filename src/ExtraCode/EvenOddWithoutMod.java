package ExtraCode;

import java.util.Scanner;

public class EvenOddWithoutMod {
    public static void main(String[] args) {
        Scanner s1=new Scanner(System.in);
        System.out.println("Enter Number");
        int num=s1.nextInt();
        int result=(num/2)*2;
        if(result==num){
            System.out.println("Even number");
        }
        else {
            System.out.println("Odd number");
        }
    }
}
