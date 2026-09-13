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
    this.username = username;
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
void deposit(double amount) 
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
        Scanner sc = new Scanner(System.in);
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
                            System.out.println("Account already registered.");
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
                                System.out.println("Invalid username or password.");
                            }
                            break;
                            case 3:
                                if (account == null)
                                {
                                    System.out.println("Please register first.");
                                    break;
                                }

                                System.out.print("Enter amount to add: ");
                                double addAmount = sc.nextDouble();

                                account.addBalance(addAmount);
                                break;

                                case 4:
                                    if (account == null)
                                    {
                                        System.out.println("Please register first.");
                                        break;
                                    }

                                    System.out.print("Enter depost amount:");
                                    double depositAmount = sc.nextDouble();

                                    account.deposit(depositAmount);
                                    break;

                                    case 5:
                                        if(account == null)
                                        {
                                            System.out.println("Please register first.");
                                            break;
                                        }

                                        System.out.print("Enter withdrawal amount:");
                                        double withdrawAmount = sc.nextDouble();

                                        account.withdraw(withdrawAmount);
                                        break;

                                        case 6:
                                            if(account == null)
                                            {
                                                System.out.println("Please register first.");
                                                break;
                                            }

                                            account.checkBalance();
                                            break;

                                            case 7:
                                                if (account == null) 
                                                {
                                                    System.out.print("Please register first.");
                                                    break;
                                                }
                                                account.logout();
                                                break;

                                                case 8:
                                                    System.out.println("Thank you for using Bank System.");
                                                    sc.close();
                                                    System.exit(0);

                                                    default:
                                                        System.out.println("Invalid choice.");
                }
        
            }
        
    }
}
