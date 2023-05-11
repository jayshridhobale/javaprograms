package Abstraction;
//step 3:-Implementation---->//buiness logic
public class LoanAccount implements Account{
    private double loanAmount=0.0;

    public LoanAccount(double loanAmount) {
        this.loanAmount = loanAmount;
        System.out.println("Loan Account is Created");
    }
    @Override
    public void deposit(double amt) {
        loanAmount-=amt;
        System.out.println(amt+"RS Debited form your Account");
    }

    @Override
    public void withdraw(double amt) {
    loanAmount+=amt;
        System.out.println(amt+"Rs Created to your account");
    }

    @Override
    public void checkBalance() {
        System.out.println("Active Loan Amount is"+loanAmount+"RS");
    }
}
