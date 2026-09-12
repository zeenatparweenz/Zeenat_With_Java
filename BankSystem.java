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
    
}
}