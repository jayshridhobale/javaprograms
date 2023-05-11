package Casting;



public class ACMain {
    public static void main(String[] args) {
       AC a1=new SplitAc();
       a1.gettype();     //upcastig


    SplitAc s1= (SplitAc) new AC();               //its is providing the ClassCastException with
                                                  //process finish with exit code 1
    s1.getType();                     //Downcasting


    }



}
