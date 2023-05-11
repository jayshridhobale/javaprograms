package ExtraCode;

import java.util.Scanner;

public class EvenNumber {
    public static void main(String[] args) {
        Scanner s1=new Scanner(System.in);
        int number, i;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the limit: ");
        number = sc.nextInt();
        i=2;
        int sum=0;
        System.out.print("Lit of even numbers: ");
        while(i<=number)
        {
            sum+=i;
            System.out.print(i +" ");
            System.out.println(sum);
            i=i+2;
        }
    }
    }

