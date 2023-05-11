package LoopingStatements;

import java.util.Scanner;

public class BreakSwitch1 {
    public static void main(String[] args) {
        Scanner s1=new Scanner(System.in);
        System.out.println("Select Course");
        System.out.println("1:Java\n2:SQL\n3:Manual\n4:WT");
        int choice=s1.nextInt();
        switch(choice){
            case 1:
                System.out.println("Selected Java");
                break;
            case 2:
                System.out.println("Selected Sql");
                break;
            case 3:
                System.out.println("Selected Manual");
                break;
            case 4:
                System.out.println("Selected WebTech");
                break;
            default:
                System.out.println("Invalid choice");

        }
    }
}
