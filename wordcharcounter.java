//4) Write a program that prompts the user for a text file name, opens the file using a FileInputStream (or FileReader), and 
// counts the total number of words and characters (excluding whitespace). Print these counts to the console. 
// Test your program on files with varied content and edge cases (e.g., empty file, file with only whitespace, etc.).

import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class wordcharcount
{

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Word Character Counter ");

        System.out.print("Enter the file name to read: ");
        String fileName = scanner.nextLine();

        try (FileReader fileReader = new FileReader(fileName);
             Scanner fileScanner = new Scanner(fileReader))
        {

            int wordCount = 0;
            int charCount = 0;

            while (fileScanner.hasNextLine())
            {
                String line = fileScanner.nextLine();
                String[] words = line.split("\\s+"); // split the line into words based on whitespace

                wordCount += words.length; // count the number of words

                for (String word : words) {
                    charCount += word.length(); // count the number of characters in each word
                }
            }

            System.out.println("Total number of words: " + wordCount);
            System.out.println("Total number of characters (excluding whitespace): " + charCount);

        }
        catch (FileNotFoundException e)
        {
            System.out.println("Error: File not found.");
        }
        catch (IOException e)
        {
            System.out.println("Error: An I/O error occurred.");
        }
        finally
        {
            System.out.println("File operation attempted.");
        }

        scanner.close();
    }
}
