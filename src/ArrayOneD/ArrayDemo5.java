package ArrayOneD;

import java.util.Scanner;

public class ArrayDemo5 {
    public static void main(String[] args) {
        Scanner s1=new Scanner(System.in);
        System.out.println("enetr the size");
        int size=s1.nextInt();

        int[] arr=new int[size];

        for(int a=0;a<size;a++){
            arr[a]=s1.nextInt();

        }

        int [] arr2=new int[size];

        int square;
        for(int a=0;a<size;a++){

            square=arr[a]*arr[a];
            arr2[a]=square;
            System.out.println(arr[a]+ "\t" +arr2[a]);
        }

    }
}
