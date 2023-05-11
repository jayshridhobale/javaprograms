package Interface;

public class Food implements Zomato,Swiggi{
    @Override
    public void orderNonVegFood() {
        System.out.println("Order Veg Food Through Zomato");
    }
    @Override
    public void orderVegFood() {
        System.out.println("Order Non Veg Food Through Swiggi");
    }
}
