package ArraylistListFramwork;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList6 {
    public static void main(String[] args) {
        Scanner s1=new Scanner(System.in);
        System.out.println("Enter start point");
        int start=s1.nextInt();
        System.out.println("Enter end point");
        int end=s1.nextInt();
        ArrayList<Integer> data1=new ArrayList<>();
        ArrayList<Integer> data2=new ArrayList<>();
        ArrayList<Integer> data3=new ArrayList<>();

        for(int a=start;a<=end;a++){
            if(a%2==0 && a%3==0)
                data3.add(a);
            else if (a%2==0)
                data1.add(a);
            else if(a%3==0)
                data2.add(a);
        }
        System.out.println("Divisible by 2 : "+data1);
        System.out.println("Divisible by 3 : "+data2);
        System.out.println("Divisible by 3 and 2 : "+data3);
        }

    }

