package MethodOverrriding;

public class Amazon extends Ecommerce{
    void sellProduct(int qty,double price){
        double total=qty*price;
        double finalAmt=total-total*0.05;
        System.out.println(finalAmt);
    }

}
