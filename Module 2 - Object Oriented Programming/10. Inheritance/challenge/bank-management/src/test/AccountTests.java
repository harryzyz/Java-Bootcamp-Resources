package src.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Before;
import org.junit.Test;

import src.main.model.account.Account;
import src.main.model.account.Chequing;
import src.main.model.account.Loan;
import src.main.model.account.Savings;

public class AccountTests {

    Account[] accounts;

    @Before
    public void setup() {
        accounts = new Account[] {
                new Chequing("f84c43f4-a634-4c57-a644-7602f8840870", "Michael Scott", 1524.51),
                new Savings("ce07d7b3-9038-43db-83ae-77fd9c0450c9", "Saul Goodman", 2241.60),
                new Loan("4991bf71-ae8f-4df9-81c1-9c79cff280a5", "Phoebe Buffay", 2537.31)
        };
    }

    @Test
    public void withdrawal() {
        Chequing chequing = (Chequing) accounts[0];
        chequing.withdraw(1440.);
        assertEquals(84.51, chequing.getBalance());
    }

    @Test
    public void overdraft() {
        Chequing chequing = (Chequing) accounts[0];
        chequing.withdraw(1534.43);
        assertEquals(-15.42, chequing.getBalance());
    }

}
