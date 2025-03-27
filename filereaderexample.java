import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class filereaderexample
{

    // method to read a file, throws FileNotFoundException
    public static void readFile(String fileName) throws FileNotFoundException
    {
        File file = new File(fileName);
        Scanner scanner = new Scanner(file);

        while (scanner.hasNextLine())                       // loop to read each line
        {
            System.out.println(scanner.nextLine());
        }
        scanner.close();
    }

    public static void main(String[] args)
    {
        Scanner inputScanner = new Scanner(System.in);

        System.out.print("Enter the file name to read: ");
        String fileName = inputScanner.nextLine();                           // read the file name

        try         // try block to read the file
        {
            readFile(fileName);
        } 
        catch (FileNotFoundException e)                   // catch the exception
        {
            System.out.println("Error: File not found.");
        } 
        finally                                   // finally block to close the scanner
        {
            System.out.println("File operation attempted.");
        }

        inputScanner.close();
    }
}
