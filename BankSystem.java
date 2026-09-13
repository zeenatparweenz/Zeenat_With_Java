import java.util.Scanner;

class BankAccount 
{
    private String name;
    private String username;
    private String password;
    private double balance;
    private boolean loggedIn;

BankAccount(String name, String username, String password) {
    this.name = name;
    this.username = password;
    this.password = password;
    this.balance = 0;
    this.loggedIn = false;

}
boolean login(String username, String password) {
    if (this.username.equals(username) && this.password.equals(password))
    {
        loggedIn = true;
        return true;
    }
    return false;
}
void logout()
{
    loggedIn = false;
    System.out.println("Logout successful.");
}
viod deposit(doubble amount) 
{
    if(!loggedIn) 
    {
        System.out.println("Please login first.");
        return;
    }
    if (amount > 0) {
        balance += amount;
        System.out.println("Amount deposite sucessfully.");
        System.out.println("Current Balance: " + balance);
    }
    else

        {

            System.out.println("Invalid amount.");
        }
}
void withdraw(double amount)
{
    if(!loggedIn)
    {
        System.out.println("please login first.");
        return;
    }

    if (amount <= 0)
    {
        System.out.println("Invalid amount.");
    }
    else if (amount > balance) {
        System.out.println("Insufficient balance.");

    }
    else 
    {
        balance -= amount;
        System.out.println("Amount withdrawn sucessfully.");
        System.out.println("Cruent Balance: " + balance);
    }
}
void checkBalance()
{
    if(!loggedIn) 
    {
        System.out.println("Please login first.");
        return;
    }
    System.out.println("Current Balance: " + balance);
}
void addBalance(double amount) 
{
    deposit(amount);
}
String getName() 
{
    return name;
}


}


public class BankSystem
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.out.in);
        BankAccount account = null;

        while  (true )
            {
                System.out.println("\n======= BANK SYSTEM =======");
                System.out.println("1. Registration");
                System.out.println("2. Login");
                System.out.println("2. Add Balance");
                System.out.println("4. Deposit");
                System.out.println("5. Withdraw");
                System.out.println("6. Check Balance");
                System.out.println("7. Logout");
                System.out.println("8. Exit");
                System.out.println("Enter your choice: ");

                int choice = sc.nextInt();
                sc.nextLine();

                switch (choice)
                {
                    case 1:
                        if(account != null)
                        {
                            System.out.peintln("Account already registered.");
                            break;
                        }

                        System.out.print("Enter Name: ");
                        String name = sc.nextLine();

                        System.out.print("Create Username: ");
                        String username = sc.nextLine();

                        System.out.print("Create Password: ");
                        String password = sc.nextLine();

                        account = new BankAccount(name, username, password);

                        System.out.println("Registration sucessful. ");
                        break;

                        case 2:
                            if (account == null )
                            {
                                System.out.println("Please register first.");
                                break;
                            }

                            System.out.print("Enter Username: ");
                            String loginUsername = sc.nextLine();

                            System.out.print("Enter Password:");
                            String loginPassword = sc.nextLine();

                            if (account.login(loginUsername, loginPassword))
                            {
                                System.out.println("Login sucessful.");
                                System.out.println("Welcome " + account.getName());

                            }
                            else
                            {
                                System.out.println("Invalid ")
                            }
                }
        
            }
        
    }
}
