public class BankAccount
{
    private double balance;

    // constructor
    BankAccount()
    {
        this.balance = 0.00;
    }

    // deposits the amount.
    public void deposit(double amount)
    {
        balance = balance + amount;
    }

    // withdraws the amount.
    public void withdraw(double amount)
    {
        balance = balance - amount;
    }

    // returns the balance.
    public double getBalance()
    {
        return balance;
    }

    // do nothing method.
    public void monthEnd()
    {
        
    }
}