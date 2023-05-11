package programing;
import java.util.Scanner;

public class Demo141 {
    public static void main(String[] args) {
        Scanner sc1=new Scanner(System.in);
        System.out.println("enter first no. ");
        int no1=sc1.nextInt();
        System.out.println("enter second no.");
        int no2= sc1.nextInt();

        System.out.println("enter range.");
        int range=sc1.nextInt();
        int third=0;
        System.out.print(no1+"\t"+no2+"\t");

        for(int i=2;i<=range;i++)
        {
            third=no1+no2;
            System.out.print(third+"\t");
            no1=no2;
            no2=third;
        }

    }

}
