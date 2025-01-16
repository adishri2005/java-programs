// 4.	Write a Java program that takes an operator (+, -, *, /, %) and
// two numbers as input from the user.
// Use a switch statement to perform the specified operation and display the result.
import java.util.Scanner;

public class switchcase //(calculator)
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Switch Case Calculator");
        // operator -> input
        System.out.println("Enter an operator (+, -, *, /, %): ");
        char operator = scanner.next().charAt(0);

        // two numbers -> input
        System.out.println("Enter the first number: ");
        double num1 = scanner.nextDouble();

        System.out.println("Enter the second number: ");
        double num2 = scanner.nextDouble();

        double result;

        //operation performance based on the operator
        switch (operator) {
            case '+':
                result = num1 + num2;
                System.out.println("Result: " + num1 + " + " + num2 + " = " + result);
                break;

            case '-':
                result = num1 - num2;
                System.out.println("Result: " + num1 + " - " + num2 + " = " + result);
                break;

            case '*':
                result = num1 * num2;
                System.out.println("Result: " + num1 + " * " + num2 + " = " + result);
                break;

            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                    System.out.println("Result: " + num1 + " / " + num2 + " = " + result);
                } else {
                    System.out.println("Division by zero is not allowed.");
                }
                break;

            case '%':
                if (num2 != 0) {
                    result = num1 % num2;
                    System.out.println("Result: " + num1 + " % " + num2 + " = " + result);
                } else {
                    System.out.println("Modulus with zero is not allowed.");
                }
                break;

            default:
                System.out.println("Invalid operator! Please enter one of (+, -, *, /, %).");
        }

        scanner.close();
    }
}