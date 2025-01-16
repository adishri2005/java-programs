// 2. Write a Java program that calculates the electricity bill based on the number of units consumed by a user. The electricity charges are determined as follows:
//•	For consumption between 1 and 100 units, the cost is Rs 5 per unit.
//•	For consumption between 101 and 200 units, the cost is Rs 7 per unit.
//•	For consumption between 201 and 300 units, the cost is Rs 10 per unit.
//•	For consumption exceeding 300 units, the cost is Rs 15 per unit.
//The program should:
//1.	Take the total units consumed as input.
//2.	Calculate the total electricity bill based on the charges above.
//3.	Display the total electricity bill.
//Example Input/Output:
//•	Input: 150
//•	Output: The total electricity bill is Rs 950.

import java.util.Scanner;

public class calculation
{
    public static void main(String[] args)
    {
        System.out.println("Electricity Bill Calculator");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the total units consumed:");
        int units = scanner.nextInt();

        int bill = 0;

        if (units <= 100)
        {
            bill = units * 5;
        }
        else if (units <= 200)
        {
            bill = (100 * 5) + (units - 100) * 7;
        }
        else if (units <= 300)
        {
            bill = (100 * 5) + (100 * 7) + (units - 200) * 10;
        }
        else
        {
            bill = (100 * 5) + (100 * 7) + (100 * 10) + (units - 300) * 15;
        }

        System.out.println("The total electricity bill is Rs " + bill + ".");
    }
}