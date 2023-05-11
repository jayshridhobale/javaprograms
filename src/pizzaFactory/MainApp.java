package pizzaFactory;

import java.util.ArrayList;
import java.util.Scanner;

public class MainApp {
    static  int a=0;
    static Scanner s1=new Scanner(System.in);
    static ArrayList vegPizza=new ArrayList();
    static ArrayList regularPizzaPrice=new ArrayList();
    static ArrayList mediumPizzaPrice=new ArrayList();
    static ArrayList largePizzaPrice=new ArrayList();
    static ArrayList nonVegPizza=new ArrayList();
    static ArrayList regularPizzaPrice1=new ArrayList();
    static ArrayList mediumPizzaPrice1=new ArrayList();
    static ArrayList largePizzaPrice1=new ArrayList();
    static ArrayList vegTopings=new ArrayList();
    static ArrayList vegTopingsPrice=new ArrayList();
    static ArrayList non_VegTopings=new ArrayList();
    static ArrayList non_VegTopingsPrice=new ArrayList();
    static ArrayList sides=new ArrayList();
    static ArrayList sidesPrice=new ArrayList();

    public static void main(String[] args) {
        vegPizza.add("Deluxe Veggie");
        regularPizzaPrice.add(150);
        mediumPizzaPrice.add(200);
        largePizzaPrice.add(325);

        vegPizza.add("Cheese and corn");
        regularPizzaPrice.add(175);
        mediumPizzaPrice.add(375);
        largePizzaPrice.add(475);

        vegPizza.add("Panner Tikka");
        regularPizzaPrice.add(160);
        mediumPizzaPrice.add(290);
        largePizzaPrice.add(340);

        nonVegPizza.add("Non-Veg Supreme");
        regularPizzaPrice1.add(190);
        mediumPizzaPrice1.add(325);
        largePizzaPrice1.add(425);

        nonVegPizza.add("Chiken Tikka");
        regularPizzaPrice1.add(210);
        mediumPizzaPrice1.add(370);
        largePizzaPrice1.add(500);

        nonVegPizza.add("Pepper Barbecue Chiken");
        regularPizzaPrice1.add(220);
        mediumPizzaPrice1.add(380);
        largePizzaPrice1.add(525);


        vegTopings.add("Black Olive");
        vegTopingsPrice.add(20);

        vegTopings.add("Capasicum");
        vegTopingsPrice.add(25);

        vegTopings.add("Paneer");
        vegTopingsPrice.add(35);

        //non-veg topings
        non_VegTopings.add("Chiken Tikka");
        non_VegTopingsPrice.add(35);

        non_VegTopings.add("Barbeque Chiken");
        non_VegTopingsPrice.add(45);

        non_VegTopings.add("Grilled Chiken");
        non_VegTopingsPrice.add(40);

        sides.add("Cold Drink");
        sidesPrice.add(55);

        sides.add("Mousse Cake");
        sidesPrice.add(90);

        boolean flag1=true;
        while (flag1==true){
            System.out.println("Select option");
            System.out.println("1:Admin login");
            System.out.println("2:customer Login");
            System.out.println("3:Exit");

            int option=s1.nextInt();
            if (option==1){
                admin();
            } else if (option==2) {
                customer();
            } else if (option==3) {
                flag1=false;
            }
        }

    }
    static void admin(){


        boolean flag=true;
        while (flag==true){
            System.out.println("select choice");
            System.out.println("1:Add pizza");
            System.out.println("2:Add topings");
            System.out.println("3:Add Sides ");
            System.out.println("4:Exit");
            int choice=s1.nextInt();

            if (choice==1){
                boolean status=true;
                while (status==true){
                    System.out.println("1: Veg Pizza");
                    System.out.println("2;Non-vegPizza");
                    System.out.println("3:Exit");
                    int select= s1.nextInt();
                    if (select==1){
                        System.out.println("Eter Pizza name");
                        String name=s1.next();
                        vegPizza.add(name);

                        System.out.println("Enter a value of regular size pizza");
                        double price1= s1.nextDouble();
                        regularPizzaPrice.add(price1);

                        System.out.println("Enter a value of Medium size pizza");
                        double price2= s1.nextDouble();
                        mediumPizzaPrice.add(price2);

                        System.out.println("Enter a value of Large size pizza");
                        double price3= s1.nextDouble();
                        largePizzaPrice.add(price3);

                    } else if (select==2) {
                        System.out.println("Enter Pizza name");
                        String name=s1.next();
                        nonVegPizza.add(name);

                        System.out.println("Enter a value of regular size pizza");
                        double price1= s1.nextDouble();
                        regularPizzaPrice1.add(price1);

                        System.out.println("Enter a value of Medium size pizza");
                        double price2= s1.nextDouble();
                        mediumPizzaPrice1.add(price2);

                        System.out.println("Enter a value of Large size pizza");
                        double price3= s1.nextDouble();
                        largePizzaPrice1.add(price3);

                    } else if (select==3) {
                        status=false;
                    }


                }
            } else if (choice==2) {
                boolean status1=true;
                while(status1==true){
                    System.out.println("1:Veg-Toppings");
                    System.out.println("2:Non-Veg Toppings");
                    System.out.println("3:Exit");
                    int option=s1.nextInt();

                    if (option==1){
                        System.out.println("Enter Toppings Name");
                        String name=s1.next();
                        vegTopings.add(name);

                        System.out.println("Enter Toppings Price");
                        double price= s1.nextDouble();
                        vegTopingsPrice.add(price);
                    } else if (option==2) {
                        System.out.println("Enter Topings Name");
                        String name=s1.next();
                        non_VegTopings.add(name);

                        System.out.println("Enter Topings Price");
                        double price= s1.nextDouble();
                        non_VegTopingsPrice.add(price);
                    } else if (option==3) {
                        status1=false;

                    }

                }
            } else if (choice==3) {
                System.out.println("Enter side");
                String name=s1.next();
                sides.add(name);

                System.out.println("Enter Sides price");
                double price=s1.nextDouble();
                sidesPrice.add(price);
            } else if (choice==4) {
                flag=false;
            }
        }

    }
    static void customer(){
        boolean flag=true;
        while (flag==true){

            System.out.println("Select option");
            System.out.println("1:Place Your order");
            System.out.println("2:Display your order with total Amount");
            System.out.println("3:Exit");
            int option=s1.nextInt();

            if (option==1){
                boolean status=true;
                while(status==true){
                    System.out.println("select menu");
                    System.out.println("1:Veg-Pizza");
                    System.out.println("2:Non-VegPizza");
                    System.out.println("3:Select sides");
                    System.out.println("4:Choose Crust");
                    System.out.println("5:Extra Cheese");
                    System.out.println("6:Exit");
                    int menu=s1.nextInt();

                    if (menu==1){
                        VegPizza v1=new VegPizza();
                        v1.diplayOrder(vegPizza,regularPizzaPrice,mediumPizzaPrice,largePizzaPrice);
                        v1.topingOrder(vegTopings,vegTopingsPrice);
                    } else if (menu==2) {
                        NonVegPizza n1=new NonVegPizza();
                        n1.nonVegOrder(nonVegPizza,regularPizzaPrice1,mediumPizzaPrice1,largePizzaPrice1);
                        n1.nonVegToppings(non_VegTopings,non_VegTopingsPrice);
                    } else if (menu==3) {
                        Sides sd1=new Sides();
                        sd1.chooseSides(sides,sidesPrice);

                    } else if (menu==4) {
                        Crust c1=new Crust();
                        c1.orderCrust();

                    } else if (menu==5) {
                        a=35;
                        System.out.println("Extra cheese: "+a);
                    } else if (menu==6) {
                        status=false;
                    }
                }

            } else if (option==2) {
                DisplayOrder d1=new DisplayOrder();
                d1.display(vegPizza,nonVegPizza,vegTopings,non_VegTopings,sides,a);
            } else if (option==3) {
                flag=false;
            }
        }
    }
}
