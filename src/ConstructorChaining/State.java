package ConstructorChaining;

public class State extends  Country{
    public State(String CouNAme,String StateNAme) {
        super(CouNAme);

        System.out.println("State name is:"+StateNAme);
    }
}
