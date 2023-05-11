package QueueFrameWork;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class QueueDemo2 {
    static Queue<Integer > tokenNumbers = new LinkedList<>();
    static int tokenNo=1;
    public static void main(String[] args) {
        Scanner s1=new Scanner(System.in);
        boolean status=true;
        while (status) {
            System.out.println("1:Generate Token");
            System.out.println("2:Process Token");
            System.out.println("3:Exit");
            int choice=s1.nextInt();
            if(choice==1){
                toGenerateToken();
            } else if (choice==2) {
                processToken();
            }
            else {
                status=false;
            }
        }
    }

    private static void processToken() {
        System.out.println("Processed Token no " +tokenNumbers.peek());
        tokenNumbers.poll();
    }

    private static void toGenerateToken() {
        System.out.println("Your Token number is " +tokenNo);
        tokenNumbers.offer(tokenNo);
        tokenNo++;
    }
}