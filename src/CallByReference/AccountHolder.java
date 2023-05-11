package CallByReference;

public class AccountHolder {
    double amount=0.0;
    String name=null;


    void acceptValues(String name, double amount) {
        this.name= name;
        this.amount= amount;
    }
}
