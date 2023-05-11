package GreenZone;
//Problem Statement:- You Have given a string print the no of substring where length is prime number
import java.util.Scanner;

public class CountPrimeSubString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String");
        String str=sc.next();
        int len=str.length();
        int count=0;
        for(int i=0;i<len;i++){
            for(int j=i+1;j<=len;j++){
                String sub=str.substring(i,j);
                System.out.println(sub);
                int num=sub.length();
                if(checkPrime(num)){
                    count++;
                }
            }
        }
        System.out.println("The Total Prime Numbered Length  Strings are:"+count);
    }

    public static boolean checkPrime(int num){
        if(num<=1){
            return false;
        }
        for(int i=2;i<=num/2;i++){
            if(num%i==0){
                return false;
            }
        }
        return true;
    }
}
