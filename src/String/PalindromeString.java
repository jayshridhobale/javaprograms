package String;

import java.util.Scanner;

public class PalindromeString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String : ");
        String str = sc.next();
        String ip = str.toUpperCase();

        char[] input = ip.toCharArray();

        char ch = 0;
        System.out.print("Given String : ");
        for(int i=0; i<input.length; i++) {
            ch= input[i];
            System.out.print(ch + " ");
        }

        System.out.println();
        char ch1 = 0;
        System.out.print("Reversed String : ");
        for(int i=input.length-1; i>=0; i--) {
            ch1= input[i];
            System.out.print(ch1 + " ");
        }


    }
}
