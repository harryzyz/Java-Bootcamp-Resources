package src.main.model.account;

import src.main.model.account.impl.Taxable;

public class Chequing extends Account implements Taxable{

    private static final double OVERDRAFT_FEE = 5.5;
    private static final double OVERDRAFT_LIMIT = 200;
    private static final double TAX_RATE = 0.15;
    private static final double TAXABLE_INCOME = 3000;
    
    public Chequing(String id, String name, double balance) {
        super(id, name, balance);
    }

    public Chequing(Chequing source) {
        super(source);
    }

    @Override
    public boolean withdraw(double amount) {
        if (super.round(super.getBalance() - amount) > 0) {
            super.setBalance(super.round(super.getBalance() - amount));
            return true;
        } else if (super.round(super.getBalance() - amount) > -OVERDRAFT_LIMIT) {
            super.setBalance(super.round(super.getBalance() - amount - OVERDRAFT_FEE));
            return true;
        } else {
            return false;
        }
    }

    @Override
    public void deposit(double amount) {
        // double tax = (amount > 3000) ? TAX_RATE: 0;
        // super.setBalance(super.round(super.getBalance() + amount * (1 - tax)));
        super.setBalance(super.round(super.getBalance() + amount));
    }

    @Override
    public void tax(double income) {
        double tax = Math.max(0, income - TAXABLE_INCOME) * TAX_RATE;
        super.setBalance(super.round(super.getBalance() - tax));
    }

    @Override
    public Account clone() {
        return new Chequing(this);
    }
    




}
