package Casting;

public class FoofFruitAppleMain {
    public static void main(String[] args) {
        //first level upcasting
        Fruit f1=new Apple();       //upcasting
        f1.fruiType();
        f1.foodType();

        //second level Upcasting
        Food d1=new Fruit();
        d1.foodType();

        System.out.println("==================================="); //using multilevel inheritance

        //fisrt Level Downcasting
        Fruit f2= (Fruit) d1;
        f2.foodType();                           //Downcating
        f2.fruiType();

        //Second level DownCasting
        Apple a1= (Apple) f1;
        a1.fruitNAme();
        a1.fruiType();
        a1.foodType();





    }
}
