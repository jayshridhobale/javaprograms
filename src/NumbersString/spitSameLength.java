package NumbersString;

import java.util.Scanner;

public class spitSameLength {
    public static void main(String[] args) {
        Scanner sc1=new Scanner(System.in);
        System.out.println("enter string");
        String str=sc1.next();
        System.out.println("enter cut");
        int no=sc1.nextInt();

        int len=str.length();
        int ch=len / no;

        if(len%no==0)
        {
            for(int i=0;i<str.length();i=i+ch)
            {
                System.out.println("string "+str.substring(i,i+ch));
            }

        }
        else {
            System.out.println("string cant divide into equal part");
        }

    }
}
