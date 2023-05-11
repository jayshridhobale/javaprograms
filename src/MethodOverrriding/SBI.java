package MethodOverrriding;

public class SBI extends Bank{
     void CalculateIntrest(double amount,int year){

    double SimpleIntrest=amount*.10*year;
         System.out.println(SimpleIntrest);
         System.out.println(amount+SimpleIntrest);


}
}
