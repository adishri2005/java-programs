//3.Write a Java program to find the second largest element in an 
// integer array without sorting the array, if not exist return -1.

import java.util.Scanner;

public class secondlargest
{

    // method to find the second largest element in an array
    public static int fsl(int[] array)  //fsl=first second largest
    {
        if (array.length < 2)
        {
            return -1; // not enough elements for a second largest
        }

        int fl = Integer.MIN_VALUE;              //fl=first largest
        int sl = Integer.MIN_VALUE;              //sl=second largest

        for (int num : array)
        {
            if (num > fl)
            {
                sl = fl;
                fl = num;
            } else if (num > sl && num != fl)
            {
                sl = num;
            }
        }

        return (sl == Integer.MIN_VALUE) ? -1 : sl;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // get size array
        System.out.println("SECOND LARGEST FINDER");
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        // initialize array
        int[] array = new int[size];

        // get the array elements from the user
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        // find the sl element
        int secondLargest = fsl(array);
        if (secondLargest == -1) {
            System.out.println("The second largest element does not exist.");
        } else {
            System.out.println("The second largest element is: " + secondLargest);
        }

        scanner.close();
    }
}
