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

