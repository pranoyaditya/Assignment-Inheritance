public class BankAccount {
    
    private double balance;
    
    // constructor
    BankAccount()
    {
        balance = 0.0;
    }

    // setter and getter methods for bank account.
    public void deposit(double amount)
    {
        balance = balance + amount;
    }

    public void withdraw(double amount)
    {
        balance = balance - amount;
    }

    public double getBalance()
    {
        return balance;
    }
}
