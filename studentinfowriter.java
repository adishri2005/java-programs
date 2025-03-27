//2)Write a Java program that takes user input for a student's name, roll number, and grade, and 
// writes this information to a file named student.txt using FileWriter. Ensure the program appends 
// the data to the file if it already exists. Handle any exceptions using try-catch and display an appropriate 
// message if an error occurs.
//Sample File Content: 
//Name: Aman, Roll Number: 120112, Grade: A
//Name: Parul, Roll Number: 120131, Grade: B



import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class studentinfowriter
{

    public static void main(String[] args)            // main method
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter student's name: ");
        String name = scanner.nextLine();

        System.out.print("Enter student's roll number: ");
        String rollNumber = scanner.nextLine();

        System.out.print("Enter student's grade: ");
        String grade = scanner.nextLine();

        String studentInfo = "Name: " + name + ", Roll Number: " + rollNumber + ", Grade: " + grade;

        try (FileWriter writer = new FileWriter("studentinfo.txt", true))        // try-with-resources block 
        {
            writer.write(studentInfo + System.lineSeparator());              // write student information to file
            System.out.println("Student information written to file.");         // display success message
        }
        catch (IOException e)                          // catch block to handle exceptions
        {
            System.out.println("Error: Unable to write to file.");                      // display error message
        }
        finally                        // finally block to close the scanner
        {
            System.out.println("File operation attempted.");                     // display message
        }

        scanner.close();
    }
}
