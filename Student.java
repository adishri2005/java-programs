//Create a Student class with attributes for name and age. Implement a default constructor to
//assign default values and a parameterized constructor to initialize the attributes with user
//defined values. Create objects using both constructors and display their details.

import java.util.Scanner;

public class Student
{
    private String name;
    private int age;

    // default constructor
    public Student()
    {
        this.name = "Default Name";
        this.age = 18;
    }

    // parameterized constructor
    public Student(String name, int age)
    {
        this.name = name;
        this.age = age;
    }

    // method to display student details
    public void displayDetails()
    {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("STUDENT MANAGER");
        System.out.print("Enter the number of students: ");
        int numberOfStudents = scanner.nextInt();
        scanner.nextLine();                                  // consume newline

        Student[] students = new Student[numberOfStudents];

        for (int i = 0; i < numberOfStudents; i++)
        {
            System.out.println("Enter details for student " + (i + 1) + ":");
            System.out.print("Enter name (or press Enter for default): ");
            String name = scanner.nextLine();

            System.out.print("Enter age (or press Enter for default): ");
            String ageInput = scanner.nextLine();

            if (name.isEmpty() && ageInput.isEmpty())
            {
                students[i] = new Student();
            }
            else
            {
                int age = ageInput.isEmpty() ? 18 : Integer.parseInt(ageInput);
                students[i] = new Student(name.isEmpty() ? "Default Name" : name, age);
            }
        }

        System.out.println("\nStudent Details:");
        for (Student student : students)
        {
            student.displayDetails();
        }

        scanner.close();
    }
}
