package Interface;

public class Paytem implements UpiPayment,WolletPayment{

    @Override
    public void transferAmount() {
        System.out.println("Transfer amount to Account");
    }

    @Override
    public void billAmount() {
        System.out.println("Transfer Amount to Wollet");
    }
}
