package MethodOverrriding;

public class Flipkart extends Ecommerce{

    void sellProduct(int qty,double price){
        double total=qty*price;
        double finalAmt=total-total*.10;
        System.out.println(finalAmt);
    }
}
