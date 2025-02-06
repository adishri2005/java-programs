//5. A company wants to develop an Employee Management System to track employee details such as name, department, salary, and employee ID. The system should also calculate the
//total salary expenditure and keep a record of the total number of employees. Implement a Java program by creating an Employee class that includes instance variables for employee ID, name, department, and salary. The class should have a default constructor that initializes employee details with default values and a parameterized constructor that sets employee details based on user input.
//Use a static variable totalEmployees to track the total number of employees and implement a static method to display this count. Additionally, define a method calculateSalary() that returns the salary of the employee and another method displayEmployeeInfo() to display all employee details. To ensure data encapsulation, mark the salary variable as private and provide a public method to access it.
//Declare the totalEmployees variable as static so that it is shared among all instances. In the main method, create multiple Employee objects using both default and parameterized
//constructors. Use this keyword in the constructors to distinguish between class variables and constructor parameters. Finally, display the total number of employees and the salary details for each employee. The program should successfully demonstrate the behavior of static and non-static members, the initialization of objects using constructors, and the role of access modifiers in an employee management scenario.

import java.util.Scanner;

public class Employee
{
    private static int totalEmployees = 0;
    private static double totalSalaryExpenditure = 0.0;

    private int employeeID;
    private String name;
    private String department;
    private double salary;

    // def constructor
    public Employee()
    {
        this.employeeID = ++totalEmployees;
        this.name = "Unknown";
        this.department = "Unknown";
        this.salary = 0.0;
    }

    // parameterized constructor
    public Employee(String name, String department, double salary)
    {
        this.employeeID = ++totalEmployees;
        this.name = name;
        this.department = department;
        this.salary = salary;
        totalSalaryExpenditure += salary;
    }

    // method to calculate salary
    public double calculateSalary()
    {
        return this.salary;
    }

    // method to display employee information
    public void displayEmployeeInfo()
    {
        System.out.println("Employee ID: " + this.employeeID);
        System.out.println("Name: " + this.name);
        System.out.println("Department: " + this.department);
        System.out.println("Salary: $" + this.salary);
    }

    // static method to display total number of employees
    public static void displayTotalEmployees()
    {
        System.out.println("Total Employees: " + totalEmployees);
    }

    // static method to display total salary expenditure
    public static void displayTotalSalaryExpenditure()
    {
        System.out.println("Total Salary Expenditure: $" + totalSalaryExpenditure);
    }

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("EMPLOYEE MANAGEMENT SYSTEM");
        System.out.print("Enter the number of employees to register: ");
        int numEmployees = scanner.nextInt();
        scanner.nextLine();                       // consume newline

        Employee[] employees = new Employee[numEmployees];

        for (int i = 0; i < numEmployees; i++)
        {
            System.out.println("\nEnter details for employee " + (i + 1) + ":");
            System.out.print("Name: ");
            String name = scanner.nextLine();
            System.out.print("Department: ");
            String department = scanner.nextLine();
            System.out.print("Salary: ");
            double salary = scanner.nextDouble();
            scanner.nextLine(); // consume newline

            employees[i] = new Employee(name, department, salary);
        }

        System.out.println("\nEmployee Details:");
        for (Employee employee : employees)
        {
            employee.displayEmployeeInfo();
            System.out.println();
        }

        Employee.displayTotalEmployees();
        Employee.displayTotalSalaryExpenditure();

        scanner.close();
    }
}
