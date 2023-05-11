package ArrayOneD;

public class ProductSimulator {
    String[] product = {"MOBILE","WATCH","TV"};
    double[] price = {25000.25, 5000.15, 35000.25};
    int[] stock = {100, 50, 35};

    void calculateBill(int choice, int count) {
        //for loop ---> search product and stock
        boolean status=false;
        for(int a=0; a<product.length; a++) {
            if(choice==a && count<=stock[a]) {
                //calculate total amount by fetching the price
                double total=count*price[a];
                System.out.println("Total Bill Amount  : " + total);
                //update the stock product
                stock[a]-=count;
                System.out.println("Updated stock is : " + stock[a]);
                status=true;
            }
        }
        if(status==false) {
            System.out.println("Product not found or out of stock.");
        }
    }
}


