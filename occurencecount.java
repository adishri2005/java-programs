// 1. Write a Java program that counts how many times a given number appears in an array.
// dynamic approach
import java.util.Scanner;

public class occurencecount
{

    // method to count occurrences of a number in an array
    public static int countOccurrences(int[] array, int number)
    {
        int count = 0;
        for (int i : array)
        {
            if (i == number)
            {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        // get size of array
        System.out.println("OCCURENCE COUNTER");
        System.out.println("Enter the size of the array: ");
        int size = scanner.nextInt();

        // initialize the array
        int[] array = new int[size];

        // get the array elements
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        // get the number to count
        System.out.print("Enter the number to count: ");
        int numberToCount = scanner.nextInt();

        // count occurrences
        int count = countOccurrences(array, numberToCount);
        System.out.println("Number " + numberToCount + " appears " + count + " times in the array.");

        scanner.close();
    }
}
