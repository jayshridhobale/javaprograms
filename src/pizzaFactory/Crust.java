package pizzaFactory;

import java.util.Scanner;

public class Crust {

    Scanner s5=new Scanner(System.in);

    public void orderCrust() {
        System.out.println("0:New Hand Tossed");
        System.out.println("1:Wheat Thin Crust");
        System.out.println("2:Cheese Burst");
        System.out.println("3:Fresh Pan Pizza");
        int crust=s5.nextInt();
    }

}

