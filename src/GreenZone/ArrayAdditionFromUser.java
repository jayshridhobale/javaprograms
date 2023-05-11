package GreenZone;

import java.util.Scanner;
//reamaining
public class ArrayAdditionFromUser {
    public static void main(String[] args) {
        Scanner s1=new Scanner(System.in);
        System.out.println("Enter The Number");
        int num=s1.nextInt();
        int[] arr=new int[num];
        for (int i=0;i<arr.length-1;i++){
            if (num==arr[arr.length-1]){
                num+=arr[i];
            }
        }
    }
}
