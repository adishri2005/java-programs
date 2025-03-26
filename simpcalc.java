//1) Create a simple calculator program with a method divide(int a, int b) that performs division.
// If the denominator is zero, the method should throw an ArithmeticException (or a custom DivisionByZeroException).
// In your main method, call divide() with various inputs (including a denominator of zero) and catch the exception
// to print a meaningful error message.

//part 1:

// simple calculator class with a divide method
public class simpcalc
{
    // method to perform division
    public int divide(int a, int b) throws divbyzero
    {
        if (b == 0)
        {
            throw new divbyzero ("Cannot divide by zero.");
        }
        return a / b;
    }
}

//part 2: 

//custom exception for division by zero
public class divbyzero extends ArithmeticException
{
    public divbyzero (String message)
    {
        super(message);
    }
}

//part 3:

import java.util.Scanner;

// class to test
public class simpcalctest
{
    public static void main(String[] args)
    {
        simpcalc calculator = new simpcalc();
        Scanner scanner = new Scanner(System.in);

        // loop to provide options to the user
        while (true)
        {
            System.out.println("Calculator Menu:");
            System.out.println("Choose an option: \n1. Divide\n2. Exit");
            int choice = scanner.nextInt();

            switch (choice)
            {
                case 1:
                    // perform division
                    System.out.print("Enter numerator: ");
                    int numerator = scanner.nextInt();
                    System.out.print("Enter denominator: ");
                    int denominator = scanner.nextInt();
                    try
                    {
                        int result = calculator.divide(numerator, denominator);
                        System.out.println("Result of " + numerator + " / " + denominator + " = " + result);
                    }
                    catch (divbyzero e)
                    {
                        System.out.println("Error: " + e.getMessage());
                    }
                    break;
                case 2:
                    // exit the program
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
