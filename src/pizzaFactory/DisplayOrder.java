package pizzaFactory;

import java.util.ArrayList;

public class DisplayOrder {

    static int type1;
    static int choice1;
    static int total1=0;
    static int type2;
    static int choice2;
    static int total2;
    static int type3;
    static int total3;


    public void vegDisply(int type, int choice, int total) {
        type1=type;
        choice1=choice;
        total1=total;


    }

    public void nonVegDislpay(int total, int choice, int type) {
        total2=total;
        choice2=choice;
        type2=type;
    }

    public void displaySides(int side, int amount1) {
        type3=side;
        total3=amount1;
    }
    public void display(ArrayList vegPizza, ArrayList nonVegPizza, ArrayList vegTopings, ArrayList nonVegTopings, ArrayList sides , int a) {

        System.out.println("Your Order is");
        System.out.println(total1);
        if (total1!=0){
            System.out.println("Pizza is :"+vegPizza.get(type1));
            System.out.println("Toppings is :"+vegTopings.get(choice1));
        }  if (total2!=0) {
            System.out.println("Pizza is :"+nonVegPizza.get(type2));
            System.out.println("Toppings is :"+nonVegTopings.get(choice2));
        }

        Sides sp1=new Sides();
        System.out.println("Sides is :"+sides.get(type3));

        int totalAmt=total1+total2+total3+a;
        System.out.println("Your total bil is :"+totalAmt);

    }
}
