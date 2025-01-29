// 2. Given an array containing N-1 unique numbers
// from 1 to N, write a Java program to find the missing number.

import java.util.Scanner;

public class missingnumber
{

    // method to find the missing number
    public static int findmissingnumber(int[] array, int n)
    {
        int expectedSum = n * (n + 1) / 2;
        int actualSum = 0;
        for (int num : array) {
            actualSum += num;
        }
        return expectedSum - actualSum;
    }

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        // get the size of the array (n-1)
        System.out.println("MISSING NUMBER FINDER");
        System.out.print("Enter the size of the array (n-1): ");
        int size = scanner.nextInt();

        // initialize the array
        int[] array = new int[size];

        // get the array elements
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++)
        {
            array[i] = scanner.nextInt();
        }

        // calculate n
        int n = size + 1;

        // find the missing number
        int missingNumber = findmissingnumber(array, n);
        System.out.println("The missing number is: " + missingNumber);

        scanner.close();
    }
}
