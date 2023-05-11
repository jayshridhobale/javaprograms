package AbstractClass;

import java.util.Scanner;

public class FliteMainApp {
    public static void main(String[] args) {
        Scanner s1=new Scanner(System.in);
        System.out.println("Select Service Provider: ");
        System.out.println("1:Air India\t\t2:Indigo");
        int choice=s1.nextInt();
        if(choice==1 || choice==2){
            System.out.println("select Routes");
            System.out.println("0:Pune-Banglore");
            System.out.println("1:Mumb(ai-Chennai");
            System.out.println("2:Kolkata-Delhi");
            int routeChoice=s1.nextInt();

            System.out.println("enter Total no of tickets");
            int count=s1.nextInt();
            FlightService service=null;

            if(choice==1){
                service=new AirIndia();

            }
            else if(choice==2){
                service=new Indigo();
            }
            service.BookTiket(count,routeChoice);
        }
        else {
            System.out.println("Invalid Choice");
        }
    }
}
