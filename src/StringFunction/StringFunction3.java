package StringFunction;


import java.util.Scanner;

//Write a prog to accept a string from user.
//And find out total no. of vowels inside the string.
public class StringFunction3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string : ");
        String str = sc.next();
        String string = str.toUpperCase();

        char[] array = string.toCharArray();

        int count=0;
        int count2=0;
        for(int i=0; i<array.length; i++) {
            if(array[i]=='A' || array[i]=='E' || array[i]=='I' || array[i]=='O' || array[i]=='U') {
                count++;
            }else {
                count2++;
            }

        }
        System.out.println("Total no. of vowels are : " + count);
        System.out.println("Total no. of consonants are : " + count2);

    }

    }


