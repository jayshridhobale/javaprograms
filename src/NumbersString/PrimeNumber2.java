package programing;

import java.util.Scanner;

public class PrimeNumber2 {
    public static void main(String[] args) {
        Scanner s1=new Scanner(System.in);
        System.out.println("enter the number");
        int no=s1.nextInt();
        int count=0;
        if(no<3)
        {
            System.out.println(no+" is prime number as well as not prime number");

        }
        else {


            for (int i = 1; i <= no; i++) {
                if (no % i == 0) {
                    count++;

                }

            }
            if (count == 2) {
                System.out.println("prime number");
            } else {
                System.out.println("not prime number");
            }
        }
    }
}
