package Abstraction;
//Step 4-executable class-->Basic Abstraction --->utilization
public class ShopMainApp {
    public static void main(String[] args) {
        Shop s1;
        s1=new ElectronicShop();  //Upcasting
        s1.getShopType();

        System.out.println("=====================");
        s1=new Grocery();
        s1.getShopType();     //upcasting
    }
}
