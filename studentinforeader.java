//3)  Write a Java program that reads the contents of a file named student.txt using FileReader and 
// displays the data on the console. Handle FileNotFoundException if the file does not exist 
// and display an appropriate error message. Use a try-catch block for exception handling.


import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class studentinforeader
{

    public static void main(String[] args)            // main method
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Student Information Reader");

        System.out.print("Enter the file name to read: ");
        String fileName = scanner.nextLine();

        try (FileReader fileReader = new FileReader(fileName);                      // try-with-resources block
             Scanner fileScanner = new Scanner(fileReader))                     // create a scanner object to read the file
        {

            while (fileScanner.hasNextLine())
            {
                System.out.println(fileScanner.nextLine());
            }

        }
        catch (FileNotFoundException e)
        {
            System.out.println("Error: File not found.");
        }
        catch (IOException e)
        {
            System.out.println("Error: An I/O error occurred.");      // 
        }
        finally
        {
            System.out.println("File operation attempted.");
        }

        scanner.close();
    }
}
