public class BasicAccount extends BankAccount{
    
    private final double OVERDRAFT_CHARGE = 30.0;

        // constructor
        BasicAccount()
        {
            super();
        }
    
        // @Override
        public void withdraw(double amount)
        {
            super.withdraw(amount);
            if(amount > super.getBalance())
            {
                System.out.println("Overdraft! Charging a penalty of $" + OVERDRAFT_CHARGE);
                super.withdraw(OVERDRAFT_CHARGE);
            }
            
        }
}
