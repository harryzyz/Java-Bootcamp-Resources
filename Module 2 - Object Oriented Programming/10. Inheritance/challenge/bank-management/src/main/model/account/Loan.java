package src.main.model.account;

public class Loan extends Account{

    private static final double INTEREST_RATE = 0.02;

    public Loan(String id, String name, double balance) {
        super(id, name, balance);
    }

    public Loan(Loan source) {
        super(source);
    }

    @Override
    public boolean withdraw(double amount) {
        if (super.round(super.getBalance() + amount * (1 + INTEREST_RATE)) < 10000) {
            super.setBalance(super.round(super.getBalance() + amount * (1 + INTEREST_RATE)));
            return true;
        } else {
            return false;
        }
    }
}
