package GreenZone;

import java.util.Scanner;

//given string which will be always divided by 3,divide substring into exact part of three characters and reverse
// and print a single string input:- abcdefghijklmno and Output:-cbafedihglkjonm
public class ReverseSubString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String");
        String str=sc.next();
        String revStr="";
        for(int i=0;i<str.length()-1;i+=3){
            String subStr=str.substring(i,i+3);
//            System.out.println(subStr);
            String demo=subStr.charAt(2)+""+subStr.charAt(1)+subStr.charAt(0);
            revStr=demo+revStr;
        }
        System.out.println(revStr);
    }

    }

