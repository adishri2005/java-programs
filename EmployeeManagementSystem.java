//1) Imagine you are developing an Employee Management System, where employee details need to be maintained securely. Create a package named EmployeeManagement that contains a class Employee with attributes such as name, id, and salary. The class should also have a method displayDetails() that prints employee information.
//Then, create another program outside the EmployeeManagement package that imports the package and utilizes the Employee class to create
//an employee object and display their details. Ensure that the package maintains encapsulation while allowing controlled access
//to employee information.
// File: src/EmployeeManagement/Employee3.java
// File: src/EmployeeManagementSystem.java
// File: src/EmployeeManagement/EmployeeManagementSystem.java

//PART 1:

package EmployeeManagement;             // package declaration for Employee Management System
import java.util.Scanner;

public class EmployeeManagementSystem 
{
    public static void main(String[] args) 
    {
        
        Scanner scanner = new Scanner(System.in);                 // creating a Scanner object for user input     
        System.out.println("EMPLOYEE MANAGEMENT SYSTEM");         // displaying system informatiom
        System.out.println("Enter employee name: ");              // prompting user to enter employee details
        String name = scanner.nextLine();

        System.out.println("Enter employee ID: ");
        int id = scanner.nextInt();

        System.out.println("Enter employee salary: ");
        double salary = scanner.nextDouble();

  
        Employee3 emp = new Employee3(name, id, salary);           // creating an Employee3 object using user input
        
                                     
        emp.displayDetails();     // displaying employee details
        scanner.close();          // closing scanner to prevent resource leak
    }
}


//PART 2:
// File: src/EmployeeManagement/Employee3.java

package EmployeeManagement;

public class Employee3                         // Employee3 class that maintains employee details securely
{
    // private attributes to enforce encapsulation
    private String name;
    private int id;
    private double salary;

    // constructor to initialize employee details
    public Employee3(String name, int id, double salary) 
    {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    // getter methods to provide controlled access to private attributes
    public String getName()
    {
        return name;
    }

    public int getId() 
    {
        return id;
    }

    public double getSalary() 
    {
        return salary;
    }

    // method to display employee details
    public void displayDetails() 
    {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Salary: " + salary);
    }
}
