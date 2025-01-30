//2. Declare a Customer class with a private variable balance.
//Implement a public addBalance(double amount) method to add funds.
//Implement a protected deductBalance(double amount) method to reduce funds.
//Define a default-access (package-private) method showBalance() to display the current balance.
//Overload the addBalance(...) method to also accept an int amount for smaller deposits.
//Objective: Create an instance of the Customer class Showcase method overloading for different deposit parameters.

import java.util.InputMismatchException;
import java.util.Scanner;

public class Customer
{
    private double balance;

    // public method to add balance (double amount)
    public void addBalance(double amount)
    {
        if (amount > 0)
        {
            balance += amount;
        }
        else
        {
            System.out.println("Amount must be positive.");
        }
    }

    // overloaded public method to add balance (int amount)
    public void addBalance(int amount)
    {
        if (amount > 0)
        {
            balance += amount;
        }
        else
        {
            System.out.println("Amount must be positive.");
        }
    }

    // protected method to deduct balance
    protected void deductBalance(double amount)
    {
        if (amount > 0 && amount <= balance)
        {
            balance -= amount;
        }
        else
        {
            System.out.println("Invalid amount. It must be positive and less than or equal to the current balance.");
        }
    }

    // default-access method to show balance
    void showBalance()
    {
        System.out.println("Current balance: " + balance);
    }

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        Customer customer = new Customer();

        while (true)
        {
            try
            {
                System.out.println("CUSTOMER BALANCE MANAGER");
                System.out.println("Choose an option:");
                System.out.println("1. Add balance (double)");
                System.out.println("2. Add balance (int)");
                System.out.println("3. Deduct balance");
                System.out.println("4. Show balance");
                System.out.println("5. Exit");
                int choice = scanner.nextInt();

                switch (choice)
                {
                    case 1:
                        System.out.print("Enter amount to add (double): ");
                        double doubleAmount = scanner.nextDouble();
                        customer.addBalance(doubleAmount);
                        break;
                    case 2:
                        System.out.print("Enter amount to add (int): ");
                        int intAmount = scanner.nextInt();
                        customer.addBalance(intAmount);
                        break;
                    case 3:
                        System.out.print("Enter amount to deduct: ");
                        double deductAmount = scanner.nextDouble();
                        customer.deductBalance(deductAmount);
                        break;
                    case 4:
                        customer.showBalance();
                        break;
                    case 5:
                        scanner.close();
                        return;
                    default:
                        System.out.println("Invalid choice. Please try again."); //error handling
                }
            }
            catch (InputMismatchException e)
            {
                System.out.println("Invalid input. Please enter a valid number."); //error handling
                scanner.next(); // clr the invalid input
            }
        }
    }
}