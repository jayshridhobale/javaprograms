package ArrayOneD;

import java.util.Scanner;

////write a program to accept number from end user and check wheather the given array contains that number or not.
public class ArrayLiteralDemo3 {

    public static void main(String[] args) {
        Scanner s1=new Scanner(System.in);
        System.out.println("enter the number" );
        int num=s1.nextInt();

        int[] arr={10,20,30,40,50};
        boolean status=false;

        for(int a=0;a<arr.length;a++) {
            if (num == arr[a]) {
                System.out.println("number is Present");
                status = true;
            }
        }
        if(status==false){
            System.out.println("number is not present");
        }

    }
}
