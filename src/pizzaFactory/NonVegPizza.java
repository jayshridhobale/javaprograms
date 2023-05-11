package pizzaFactory;

import java.util.ArrayList;
import java.util.Scanner;

public class NonVegPizza {
    Scanner s2=new Scanner(System.in);
    int amount=0;
    int type;
    public void nonVegOrder(ArrayList nonVegPizza, ArrayList regularPizzaPrice1, ArrayList mediumPizzaPrice1, ArrayList largePizzaPrice1) {
        boolean status=true;

        int amount=0;
        while (status==true){
            ArrayList priceOfPizza=new ArrayList();
            int count=0;
            System.out.println("Select pizza or press -1 for Exit");
            for (Object sc:nonVegPizza){
                System.out.println(count+":"+sc);
                count++;
            }
            type= s2.nextInt();
            if (type!=-1){
                System.out.println("select size of Pizza");
                System.out.println("0:Regular Size Pizza"+"price is:"+regularPizzaPrice1.get(type));
                System.out.println("1:medium Size Pizza"+"Price is:"+mediumPizzaPrice1.get(type));
                System.out.println("2:Large Size pizza"+"Price is:"+largePizzaPrice1.get(type));

                int pizza=s2.nextInt();
                priceOfPizza.add(pizza);

                for (Object it:priceOfPizza){
                    int ab= (int) it;
                    if (ab==0){
                        Object cost=  regularPizzaPrice1.get(type);
                        amount= amount+(int) cost;
                    } else if (ab==1) {
                        Object cost=  mediumPizzaPrice1.get(type);
                        amount= amount+(int) cost;
                    } else if (ab==2) {
                        Object cost=  largePizzaPrice1.get(type);
                        amount= amount+(int) cost;
                    }


                }
            } else if (type==-1) {
                status=false;
            }
        }

    }





    public void nonVegToppings(ArrayList nonVegToppings1, ArrayList nonVegToppingsPrice) {
        int count=0;
        System.out.println("choose toppings");
        for (Object tp:nonVegToppings1){
            System.out.println(count+":"+tp+"Prise is :"+nonVegToppingsPrice.get(count));
            count++;
        }
        int choice=s2.nextInt();

        int amount1= (int) nonVegToppingsPrice.get(choice);

        int total=amount1+amount;
        DisplayOrder d3=new DisplayOrder();
        d3.nonVegDislpay(total,choice,type);
    }
}
