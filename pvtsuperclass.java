//1. Write a Java program to demonstrate that a private member of a
//superclass cannot be accessed directly from a derived class.

//superclass: it is a class from which other classes are derived.
// it is also known as a parent class or base class.

import java.util.Scanner;

// Superclass with a private member
class pvtsuperclass
{
    private int privateNumber;

    // constructor to set the private member
    public pvtsuperclass(int privateNumber)
    {
        this.privateNumber = privateNumber;
    }

    // public method to access the private member
    public int getPrivateNumber()
    {
        return privateNumber;
    }
}

// derived class attempting to access the private member
class DerivedClass extends pvtsuperclass
{
    public DerivedClass(int privateNumber)
    {
        super(privateNumber);
    }

    public void displayPrivateNumber()
    {
        // compilation error because privateNumber is private in Superclass
        // System.out.println("Private Number: " + privateNumber);

        // Correct way to access the private member through a public method
        System.out.println("Private Number (accessed via method): " + getPrivateNumber());
    }
}

// main class to run the program
class Main1
{

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("PRIVATE MEMBER ACCESS DEMO");
        System.out.print("Enter a number for the private member: ");
        int privateNumber = scanner.nextInt();

        DerivedClass derived = new DerivedClass(privateNumber);
        derived.displayPrivateNumber();

        scanner.close();
    }
}
