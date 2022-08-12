package src.main.model.account;


public class Loan extends Account{

    private static final double INTEREST_RATE = 0.02;
    private static final double MAX_DEBT = 10000;

    public Loan(String id, String name, double balance) {
        super(id, name, balance);
    }

    public Loan(Loan source) {
        super(source);
    }

    @Override
    public boolean withdraw(double amount) {
        if (super.round(super.getBalance() + amount * (1 + INTEREST_RATE)) < MAX_DEBT) {
            super.setBalance(super.round(super.getBalance() + amount * (1 + INTEREST_RATE)));
            return true;
        } else {
            return false;
        }
    }

    @Override
    public void deposit(double amount) {
        super.setBalance(super.round(super.getBalance() - amount));
    }

    @Override
    public Account clone() {
        return new Loan(this);
    }
}
