package pizzaFactory;

import java.util.ArrayList;
import java.util.Scanner;

public class Sides {
    Scanner s4=new Scanner(System.in);
    public void chooseSides(ArrayList sides, ArrayList sidesPrice) {
        int count=0;
        System.out.println("Select Sides");
        for (Object sc:sides){
            System.out.println(count+":"+sc+" Prise is :"+sidesPrice.get(count));
            count++;
        }
        int side=s4.nextInt();
        int amount1= (int) sidesPrice.get(side);
        DisplayOrder d4=new DisplayOrder();
        d4.displaySides(side,amount1);

    }
}
