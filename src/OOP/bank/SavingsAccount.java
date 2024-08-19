package OOP.bank;

public class SavingsAccount extends Bank {

    public SavingsAccount(String accountNumber, double balance) {
        super(accountNumber, balance);
    }
    /**
     * @param amount
     */
    @Override
    protected void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
        } else {
            System.out.println("Insufficient balance");
        }
    }

    /**
     * @param amount
     */
    @Override
    protected void deposit(double amount) {
        balance += amount;
    }
}
