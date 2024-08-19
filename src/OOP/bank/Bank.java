package OOP.bank;

public abstract class Bank {
    String accountNumber;
    double balance;

    public Bank(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    protected abstract void withdraw(double amount);

    protected abstract void deposit(double amount);

    @Override
    public String toString(){
        return "Account number " + accountNumber + " balance " + balance;
    }
}
