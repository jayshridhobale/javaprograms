package Casting;

import java.util.Scanner;

public class TVMain {
    public static void main(String[] args) {
        Scanner s1=new Scanner(System.in);
        System.out.println("Select type of Tv");

        System.out.println("1:LCD");
        System.out.println("2:LED");
        int choice=s1.nextInt();
        Tv t1=null;
        if(choice==1){
            t1=new LCD();

        }
        else if(choice==2){
            t1=new LED();

        }
        t1.getType();
    }
}
