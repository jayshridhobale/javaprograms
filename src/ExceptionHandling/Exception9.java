package ExceptionHandling;
//ucheck-Run time Exception
public class Exception9 {
    public static void main(String[] args) {

        calculateBill(-12,250);
    }
    static void calculateBill(int qty,int price){
        if(qty>0 && price>0){
            double total=qty*price;
            System.out.println("Total is : "+total);
        }
        else{
            //Explicit Exception
            throw new IllegalArgumentException("Invalid Price qty and price");
        }
    }
}
