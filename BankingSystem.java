//2) In a Banking System, different types of users, such as bank employees and customers, need access to account operations with varying permissions. 
  //Create a package named BankingSystem containing a class BankAccount that has four methods with different access modifiers: a public method deposit() for adding money, 
  //a protected method withdraw() for authorized transactions, a default-access method checkBalance() to be accessed within the same package, and 
  //a private method calculateInterest() to compute interest internally. Then, create another package named UserAccount with a class Customer that tries
  //to access these methods from an instance of BankAccount. Demonstrate which methods are accessible and explain why some cannot be accessed based on Java’s access modifier rules.

//PART 1:

package BankingSystem;

public class BankAccount {
    private double balance;

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    // Public method to deposit money
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: $" + amount);
        }
    }

    // Protected method to withdraw money
    protected void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew: $" + amount);
        } else {
            System.out.println("Insufficient funds or invalid amount.");
        }
    }

    // Default-access method to check balance
    void checkBalance() {
        System.out.println("Current balance: $" + balance);
    }

    // Private method to calculate interest
    private double calculateInterest(double rate) {
        return balance * rate / 100;
    }
}

//part 2: 

package UserAccount;

import BankingSystem.BankAccount;
import java.util.Scanner;

public class Customer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Banking System");
        System.out.print("Enter initial balance: ");
        double initialBalance = scanner.nextDouble();
        BankAccount account = new BankAccount(initialBalance);

        System.out.print("Enter amount to deposit: ");
        double depositAmount = scanner.nextDouble();
        account.deposit(depositAmount);

        // Accessing protected method - Not accessible
        // System.out.print("Enter amount to withdraw: ");
        // double withdrawAmount = scanner.nextDouble();
        // Accessing default-access method - Not accessible
        // account.withdraw(withdrawAmount); // Error: withdraw() has protected access in BankingSystem.BankAccount

        // account.checkBalance(); // Error: checkBalance() is not public in BankingSystem.BankAccount; cannot be accessed from outside package

        // Accessing private method - Not accessible
        // double interest = account.calculateInterest(5); // Error: calculateInterest(double) has private access in BankingSystem.BankAccount

        scanner.close();
    }
}
