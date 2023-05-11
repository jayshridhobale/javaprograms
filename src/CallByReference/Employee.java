package CallByReference;

public class Employee {
    void calculateAmount(AccountHolder ah) {
        System.out.println("Amount to be withdrawn is : " + ah.amount);
        System.out.println("Account holder's name is : " + ah.name);
    }

}
