//2. Design a Java class Employee with attributes name, emp id, and salary. Implement a default
//constructor, a parameterized constructor, and methods to return the employee’s name and salary.
//Add a method increaseSalary(double percentage) to raise the salary by a user specified percentage.
//Create a subclass Manager with an additional instance variable department. Develop a test program to validate these functionalities.

// PART 1:

public class Employee2
{
    private String name;
    private int empid;
    private double salary;

    // default constructor
    public Employee2()
    {
        this.name = "Unknown";
        this.empid = 0;
        this.salary = 0.0;
    }

    // parameterized constructor
    public Employee2(String name, int empid, double salary)
    {
        this.name = name;
        this.empid = empid;
        this.salary = salary;
    }

    // method to return the employee's name
    public String getName()
    {
        return name;
    }

    // method to return the employee's salary
    public double getSalary()
    {
        return salary;
    }

    // method to increase the salary by a specified percentage
    public void increaseSalary(double percentage)
    {
        if (percentage > 0)
        {
            this.salary += this.salary * percentage / 100;
        }
    }

    // method to display employee information
    public void displayEmployeeInfo()
    {
        System.out.println("Employee ID: " + empid);
        System.out.println("Name: " + name);
        System.out.println("Salary: $" + salary);
    }
}


//PART 2:
//#src/Employee2.java continued

public class Manager extends Employee2
{
    private String department;

    // default constructor
    public Manager()
    {
        super();
        this.department = "Unknown";
    }

    // parameterized constructor
    public Manager(String name, int empid, double salary, String department)
    {
        super(name, empid, salary);
        this.department = department;
    }

    // method to display manager information
    @Override
    public void displayEmployeeInfo()
    {
        super.displayEmployeeInfo();
        System.out.println("Department: " + department);
    }
}


//PART 3:
//#src/Employee2.java continued (last part)

import java.util.Scanner;

public class TestProgram 
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("EMPLOYEE MANAGEMENT SYSTEM");
        System.out.print("Enter the number of employees to register: ");
        int numEmployees = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        Employee2[] employees = new Employee2[numEmployees];

        for (int i = 0; i < numEmployees; i++)
        {
            System.out.println("\nEnter details for employee " + (i + 1) + ":");
            System.out.print("Name: ");
            String name = scanner.nextLine();
            System.out.print("Employee ID: ");
            int empid = scanner.nextInt();
            System.out.print("Salary: ");
            double salary = scanner.nextDouble();
            scanner.nextLine(); // consume newline

            System.out.print("Is this employee a manager? (yes/no): ");
            String isManager = scanner.nextLine();

            if (isManager.equalsIgnoreCase("yes"))
            {
                System.out.print("Department: ");
                String department = scanner.nextLine();
                employees[i] = new Manager(name, empid, salary, department);
            }
            else
            {
                employees[i] = new Employee2(name, empid, salary);
            }
        }

        System.out.println("\nEmployee Details:");
        for (Employee2 employee : employees)
        {
            employee.displayEmployeeInfo();
            System.out.println();
        }

        scanner.close();
    }
}
