package ArrayOneD;

import java.util.Scanner;

public class ArrayDemo6 {
    public static void main(String[] args) {
        Scanner s1=new Scanner(System.in);
        System.out.println("enetr num of String");
        int no=s1.nextInt();


        String[] arr=new String[no];

        for(int a=0;a<no;a++){
            arr[a]=s1.next();

            System.out.println( "Welcom"+ "\t" +arr[a]);
        }
    }
}
