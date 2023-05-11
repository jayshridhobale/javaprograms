package ConstructorChaining;

public class District extends  State{

    public District(String CouNAme, String StateNAme,String DisNAme) {
        super(CouNAme, StateNAme);
        System.out.println("District Name is:"+DisNAme);
    }
}
