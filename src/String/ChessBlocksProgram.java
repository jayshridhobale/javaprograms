package String;

import java.util.Scanner;

public class ChessBlocksProgram {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter co-ordinate of tile");
        String input= sc.next();
        char a =input.charAt(0);
        int b=input.charAt(1);

        if (a%2==0 && b%2!=0)
        {
            System.out.println("White");
        }
        else
        {
            System.out.println("Black");
        }


    }
}






