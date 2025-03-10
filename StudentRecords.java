//3) In a Student Records Management System, personal and academic details of students need to be stored securely while providing controlled 
//access to their data. Create a package named StudentRecords containing a class Student with private attributes studentId, name, and grade. 
//Provide a public constructor to initialize these attributes and a method displayStudentInfo() to print student details. 
//Then, write another program outside the package that imports StudentRecords, creates Student objects, and displays their details. 
//This exercise will illustrate how encapsulation is maintained in Java, allowing data to be 
//accessed only through well-defined public methods while preventing direct modification of private fields.

//PART 1:

package StudentRecords;

import java.util.Scanner;

public class Student2
{
    private String studentId;
    private String name;
    private String grade;

    public Student2(String studentId, String name, String grade) {
        this.studentId = studentId;
        this.name = name;
        this.grade = grade;
    }

    public void displayStudentInfo() {
        System.out.println("Student ID: " + studentId);
        System.out.println("Name: " + name);
        System.out.println("Grade: " + grade);
    }
}

//PART 2: 

package StudentRecords;

import StudentRecords.Student2;
import java.util.Scanner;


import java.util.Scanner;

public class StudentInfoDisplay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("STUDENT RECORDS");
        System.out.print("Enter Student ID: ");
        String studentId = scanner.nextLine();

        System.out.print("Enter Student Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter Student Grade: ");
        String grade = scanner.nextLine();

        Student2 student = new Student2(studentId, name, grade);
        student.displayStudentInfo();

        scanner.close();
    }
}
