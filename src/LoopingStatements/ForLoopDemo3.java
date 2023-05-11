package LoopingStatements;
import java.util.Scanner;
public class ForLoopDemo3 {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);

        System.out.println("enter start point:");
        int start = s1.nextInt();

        System.out.println("enter end point:");
        int end = s1.nextInt();

        for (int a = start; a <= end; a++) {
            if (a % 2 != 0) {
                System.out.println(a);
            }
        }
    }
}
