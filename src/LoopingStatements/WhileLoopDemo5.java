package LoopingStatements;

import java.util.Scanner;

public class WhileLoopDemo5 {
    public static void main(String[] args) {
        Scanner s1 =new Scanner(System.in);

        int num=0;
        while(num>=0){
            System.out.println("enetr new number");
            num=s1.nextInt();

        }
        System.out.println(num);
    }
    }

