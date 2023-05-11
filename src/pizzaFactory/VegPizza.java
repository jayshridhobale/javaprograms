package pizzaFactory;

import java.util.ArrayList;
import java.util.Scanner;

public class VegPizza {

    Scanner s2=new Scanner(System.in);
    int amount=0;
    int amount1=0;
    int type1;
    public void diplayOrder(ArrayList vegPizza, ArrayList regularPizzaPrice, ArrayList mediumPizzaPrice, ArrayList largePizzaPrice) {
        boolean status=true;


        while (status==true){
            ArrayList  priceOfPizza=new ArrayList();
            int count=0;
            System.out.println("Select pizza or press -1 for Exit");
            for (Object sc:vegPizza){
                System.out.println(count+":"+sc);
                count++;
            }
            int type= s2.nextInt();
            if (type!=-1){
                type1=type;
            }
            if (type!=-1){
                System.out.println("select size of Pizza");
                System.out.println("0:Regular Size Pizza"+"price is:"+regularPizzaPrice.get(type));
                System.out.println("1:medium Size Pizza"+"Price is:"+mediumPizzaPrice.get(type));
                System.out.println("2:Large Size pizza"+"Price is:"+largePizzaPrice.get(type));

                int pizza=s2.nextInt();
                priceOfPizza.add(pizza);

                for (Object it:priceOfPizza){
                    int ab= (int) it;
                    if (ab==0){
                        Object cost=  regularPizzaPrice.get(type);
                        amount= amount+(int) cost;
                    } else if (ab==1) {
                        Object cost=  mediumPizzaPrice.get(type);
                        amount= amount+(int) cost;
                    } else if (ab==2) {
                        Object cost=  largePizzaPrice.get(type);
                        amount= amount+(int) cost;
                    }


                }
            } else if (type==-1) {
                status=false;
            }
        }

    }



    public void topingOrder(ArrayList vegTopings, ArrayList vegTopingsPrice) {

        int count=0;
        System.out.println("choose toppings");
        for (Object tp:vegTopings){
            System.out.println(count+":"+tp+"Prise is :"+vegTopingsPrice.get(count));
            count++;
        }
        int choice=s2.nextInt();

        amount1= (int) vegTopingsPrice.get(choice);
        int total=amount+amount1;

        DisplayOrder d2=new DisplayOrder();

        d2.vegDisply(type1,choice,total);

    }
}
