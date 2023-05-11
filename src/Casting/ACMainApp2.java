package Casting;

public class ACMainApp2 {
    public static void main(String[] args) {
        AC a2 = new AC();      //upcasting


        if (a2 instanceof SplitAc ){           //Avoid classcastException  Using InstanceOf OPerator?
            SplitAc s2 = (SplitAc) a2;
        }
        else{
            System.out.println("Properties are not available");
        }
    }
}