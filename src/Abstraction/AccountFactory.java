package Abstraction;
//step 5:- factory class---> create object of implemented class
public class AccountFactory {
    Account createAccount(int choice,double amt) {
        Account a1 = null;
        if (choice == 1) {
            a1 = new SavingAccount(amt); //upcasting
        } else if (choice==2) {
            a1=new LoanAccount(amt);
        }
        return a1;
    }

}
