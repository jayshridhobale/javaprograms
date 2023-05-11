package JavaTest4;

import Casting.AC;
import Casting.SplitAc;

public class MobileMainQ4 {
    public static void main(String[] args) {


        MobileQ4 m3 = new MobileQ4();      //upcasting


       if(m3 instanceof SmartPhone){
           SmartPhone s2=(SmartPhone) m3;
        } else {
            System.out.println("Properties are not available");
        }
    }
}