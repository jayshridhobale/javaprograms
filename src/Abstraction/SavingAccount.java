package Abstraction;
//step 2:-Implementation class
public class SavingAccount implements Account{
    private  double accountBalance=0.0;
    //account creation
    public SavingAccount(double accountBalance){
        this.accountBalance=accountBalance;
        System.out.println("Saving Account is created:");
    }
    @Override
    public void deposit(double amt) {
        accountBalance+=amt;
        System.out.println(amt+"Rs created to your account");
    }

    @Override
    public void withdraw(double amt) {
        if (amt <= accountBalance) {
            accountBalance -= amt;
            System.out.println(amt+"RS Debited from your account");
        }
    }
    @Override
    public void checkBalance() {
        System.out.println("Account Balance is"+accountBalance);
    }
}
