// 2.Create a BankAccount class with a private variable balance to store the account balance.
//Implement a public method deposit(double amount) to add funds, a protected method
//withdraw(double amount) to deduct funds, and a default-access method checkBalance()
//to display the current balance. Create an object of the class and
//demonstrate which methods and variables can be accessed both inside and outside the class.

import java.util.Scanner;

public class BankAccount
{
    private double balance;

    // public method to deposit funds
    public void deposit(double amount)
    {
        if (amount > 0)
        {
            balance += amount;
            System.out.println("Deposited: $" + amount);
        }
        else
        {
            System.out.println("Invalid deposit amount");
        }
    }

    // protected method to withdraw funds
    protected void withdraw(double amount)
    {
        if (amount > 0 && amount <= balance)
        {
            balance -= amount;
            System.out.println("Withdrew: $" + amount);
        }
        else
        {
            System.out.println("Invalid withdrawal amount or insufficient funds");
        }
    }

    // def-access method to check balance
    void checkBalance()
    {
        System.out.println("Current Balance: $" + balance);
    }

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        BankAccount account = new BankAccount();

        while (true)
        {
            System.out.println("\nBANK ACCOUNT MANAGER");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();

            switch (choice)
            {
                case 1:
                    System.out.print("Enter amount to deposit: ");
                    double depositAmount = scanner.nextDouble();
                    account.deposit(depositAmount);
                    break;
                case 2:
                    System.out.print("Enter amount to withdraw: ");
                    double withdrawAmount = scanner.nextDouble();
                    account.withdraw(withdrawAmount);
                    break;
                case 3:
                    account.checkBalance();
                    break;
                case 4:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
