package ArrayOneD;

import java.util.Scanner;

public class ArrayDemo4 {
    public static void main(String[] args) {
        Scanner s1=new Scanner(System.in);
        System.out.println("enter the size");
        int size=s1.nextInt();

        int[] arr=new int[size];
        System.out.println("enter new number");
        for(int i=0;i<size;i++){
            arr[i]=s1.nextInt();
        }

        for(int i=0;i<size;i++){
            System.out.println("number after taking : " +arr[i]);
        }
    }
}
