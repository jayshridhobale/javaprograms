package MethodOverrriding;

public class ICICI extends Bank {

    void CalculateIntrest(double amount, int year) {


        double simpleIntrest = amount*0.05*year; ;
        System.out.println(simpleIntrest);
        System.out.println(amount*simpleIntrest);


    }
}