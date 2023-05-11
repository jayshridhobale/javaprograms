package Casting;

import java.util.Scanner;

public class EmploeeMain {
    public static void main(String[] args) {
        Scanner s1=new Scanner(System.in);
        System.out.println("select Possition:");
        System.out.println("1:Devloper");
        System.out.println("2:Tester");

        int choice=s1.nextInt();
        Employee e1=null;
        if(choice==1){
            e1=new Devloper();         //upcasting

        }
        else if (choice==2)
        {
            e1=new Tester();    //upcasting


        }
        e1.getpost();
    }
}
