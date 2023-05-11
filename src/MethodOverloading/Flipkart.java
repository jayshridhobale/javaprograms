package MethodOverloading;

public class Flipkart {
    int cardno=12345;
    int cvvno =112233;
    int upipin=98765;

    void payment(int cno ,int cvv,int amount){
        if(cno==cardno && cvvno==cvvno) {
            double increment1 = amount + amount * .10;
            System.out.println(increment1);
            System.out.println("payment is Suceesfully:");
        }
        else {
            System.out.println("Invalid Payment Details");
        }
    }
    void payment(int upi ,int amount){
        if(upi==upipin){
            double increment2=amount+amount*0.05;
            System.out.println(increment2);
            System.out.println("payment is sucessfully:");
        }
        else {
            System.out.println("Invalid payment Details");
        }
    }


}

