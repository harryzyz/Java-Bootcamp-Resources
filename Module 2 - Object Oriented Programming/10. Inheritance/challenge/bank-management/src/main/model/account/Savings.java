package src.main.model.account;

public class Savings extends Account{

    private static final double WITHDRAW_FEE = 5.;

    public Savings(String id, String name, double balance) {
        super(id, name, balance);
    }

    public Savings(Savings source) {
        super(source);
    }

    @Override
    public boolean withdraw(double amount) {
        super.setBalance(super.round(super.getBalance() - amount - WITHDRAW_FEE));
        return false;
    }


}
