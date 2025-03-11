//3.	Design an interface called Wallet that declares two methods:
// addFunds(double amount) and spendFunds(double amount). Implement this
// interface in a class named DigitalWallet that maintains a private
// balance variable. Ensure that the class provides controlled
// access to update the balance only through the interface methods.
// Then, write a separate class with a main method that creates a
// DigitalWallet object, performs a series of fund additions and expenditures,
// and prints the updated balance to verify that external classes cannot
// directly manipulate the wallet’s internal data.

//PART 1:

import java.util.Scanner;

// interface wallet with methods to add and spend funds
public interface Wallet 
{
    void addFunds(double amount);
    void spendFunds(double amount);
}

//PART 2:

// class DigitalWallet implementing Wallet interface
public class DigitalWallet implements Wallet 
{
    // private balance variable to store the wallet balance
    private double balance;

    // constructor to initialize balance to 0.0
    public DigitalWallet() 
    {
        this.balance = 0.0;
    }

    // method to add funds to the wallet
    @Override
    public void addFunds(double amount) 
    {
        if (amount > 0) 
           {
            balance += amount;
            System.out.println("Added: $" + amount);
        } 
         else 
        {
            System.out.println("Invalid amount to add.");
        }
    }

    // method to spend funds from the wallet
    @Override
    public void spendFunds(double amount) 
        {
        if (amount > 0 && amount <= balance) 
        {
            balance -= amount;
            System.out.println("Spent: $" + amount);
        } 
        else 
        {
            System.out.println("Insufficient funds or invalid amount.");
        }
    }

    // method to display the current balance
    public void displayBalance() {
        System.out.println("Current balance: $" + balance);
    }
}

//PART 3:

import java.util.Scanner;

// class WalletTest with main method to test DigitalWallet
public class WalletTest
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        DigitalWallet wallet = new DigitalWallet();

        // loop to provide options to the user
        while (true)
        {
            System.out.println("Wallet Menu: ");
            System.out.println("Choose an option: \n1. Add Funds\n 2. Spend Funds\n 3. Display Balance\n 4. Exit\n");
            int choice = scanner.nextInt();

            switch (choice)
            {
                case 1:
                    // add funds to the wallet
                    System.out.print("Enter amount to add: ");
                    double addAmount = scanner.nextDouble();
                    wallet.addFunds(addAmount);
                    break;
                case 2:
                    // spend funds from wallet
                    System.out.print("Enter amount to spend: ");
                    double spendAmount = scanner.nextDouble();
                    wallet.spendFunds(spendAmount);
                    break;
                case 3:
                    // display current bal
                    wallet.displayBalance();
                    break;
                case 4:
                    // exit the pgm
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    // handle invalid choices
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
