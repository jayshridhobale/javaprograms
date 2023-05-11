package LoopingStatements;
import java.util.Scanner;
public class WhileLoopDemo3 {
    public static void main(String[] args) {
        Scanner s1 =new Scanner(System.in);
        int sum=0;
        int num=0;
        while(num%2==0){
            System.out.println("enetr new number");
            num=s1.nextInt();
            sum=sum+num;
        }
        System.out.println(sum);
    }
}
