public class CheckingAccount extends BankAccount{
    
    private boolean firstWithdraw;
    private final double FIRST_WITHDRAW_FEE = 20.0;
    private final double PENALTY = 30.0;

    // constructor
    CheckingAccount()
    {
        super();
        firstWithdraw = false;
    }

    // @Overrides
    public void withdraw(double amount)
    {
        super.withdraw(amount);

        if(firstWithdraw == false) 
        {
            firstWithdraw = true;
            super.withdraw(FIRST_WITHDRAW_FEE);
            System.out.println("$20 has been charged!");
        }
        else 
        {
            super.withdraw(PENALTY);
            System.out.println("$30 has been charged!");
        }
    }

    // resets the firstWithdraw.
    public void monthEnd()
    {
        firstWithdraw = false;
    }
}
