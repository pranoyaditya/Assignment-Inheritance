import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        CheckingAccount checkingAccount = new CheckingAccount();


        while(true)
        {
            System.out.println("\nD)eposit\tW)tihdraw\tG)et Balance\tQ)uit");
            System.out.print("Enter your response: ");
            String response = sc.next();

            if(response.equals("D") || response.equals("W"))
            {
                System.out.print("Enter amount: ");
                double amount = sc.nextDouble();

                if(response.equals("D"))
                {
                    checkingAccount.deposit(amount);
                    System.out.println("Your current balance: " + checkingAccount.getBalance());
                }
                else
                {
                    checkingAccount.withdraw(amount);
                    System.out.println("Your current balance: " + checkingAccount.getBalance());
                }
            }
            else if(response.equals("G"))
            {
                System.out.println("Your current balance: " + checkingAccount.getBalance());
            }
            else if(response.equals("Q"))
            {
                sc.close();
                break;
            }
            else 
            {
                System.out.println("Wrong input! Try Again.");
            }
        }
    }
}

