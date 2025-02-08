//3. A university has different types of people associated with it, including staff members and students.
//base class Person contains common attributes such as name, age, and address.The class Staff extends Person
//and adds attributes like staffId and department. Further, a subclass Professor extends Staff by introducing an
//additional attribute, specialization, and a method conductLecture(). Similarly, the Student class extends Person
//and adds studentId and course. Finally, the subclassGraduateStudent extends Student, adding researchTopic and a method submitThesis().
//Implement this university management system in Java using multilevel inheritance and method overriding.Demonstrate polymorphism by
//creating an array of Person objects containing instances of Professor and GraduateStudent, and call their respective methods.

//PART 1:

public class Person
{
    private String name;
    private int age;
    private String address;

    // default constructor
    public Person()
    {
        this.name = "Unknown";
        this.age = 0;
        this.address = "Unknown";
    }

    // parameterized constructor
    public Person(String name, int age, String address)
    {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    // method to display person information
    public void displayInfo()
    {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Address: " + address);
    }
}

//PART 2:
//#src/Person.java continued (part 2)

public class Staff extends Person
{
    private String staffId;
    private String department;

    // default constructor
    public Staff()
    {
        super();
        this.staffId = "Unknown";
        this.department = "Unknown";
    }

    // Parameterized constructor
    public Staff(String name, int age, String address, String staffId, String department)
    {
        super(name, age, address);
        this.staffId = staffId;
        this.department = department;
    }

    // method to display staff information
    @Override
    public void displayInfo()
    {
        super.displayInfo();
        System.out.println("Staff ID: " + staffId);
        System.out.println("Department: " + department);
    }
}

//PART 3:
//#src/Person.java continued (part 3)

public class Professor extends Staff
{
    private String specialization;

    // default constructor
    public Professor()
    {
        super();
        this.specialization = "Unknown";
    }

    // parameterized constructor
    public Professor(String name, int age, String address, String staffId, String department, String specialization)
    {
        super(name, age, address, staffId, department);
        this.specialization = specialization;
    }

    // method to conduct lecture
    public void conductLecture()
    {
        System.out.println("Conducting lecture on " + specialization);
    }

    // method to display professor information
    @Override
    public void displayInfo()
    {
        super.displayInfo();
        System.out.println("Specialization: " + specialization);
    }
}

//PART 4:
//#src/Person.java continued (part 4)

public class Student extends Person
{
    private String studentId;
    private String course;

    // default constructor
    public Student()
    {
        super();
        this.studentId = "Unknown";
        this.course = "Unknown";
    }

    // parameterized constructor
    public Student(String name, int age, String address, String studentId, String course)
    {
        super(name, age, address);
        this.studentId = studentId;
        this.course = course;
    }

    // method to display student information
    @Override
    public void displayInfo()
    {
        super.displayInfo();
        System.out.println("Student ID: " + studentId);
        System.out.println("Course: " + course);
    }
}

//PART 5:
//#src/Person.java continued (part 5)
public class GraduateStudent extends Student
{
    private String researchTopic;

    // default constructor
    public GraduateStudent()
    {
        super();
        this.researchTopic = "Unknown";
    }

    // parameterized constructor
    public GraduateStudent(String name, int age, String address, String studentId, String course, String researchTopic)
    {
        super(name, age, address, studentId, course);
        this.researchTopic = researchTopic;
    }

    // method to submit thesis
    public void submitThesis()
    {
        System.out.println("Submitting thesis on " + researchTopic);
    }

    // method to display graduate student information
    @Override
    public void displayInfo()
    {
        super.displayInfo();
        System.out.println("Research Topic: " + researchTopic);
    }
}

//PART 6:
//#src/Person.java continued (part 6)


import java.util.Scanner;

public class TestProgramUni
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
System.out.println("UNIVERSITY MANAGEMENT SYSTEM");
System.out.println("Welcome to the University Management System");
        System.out.print("Enter the number of people to register: ");
        int numPeople = scanner.nextInt();
        scanner.nextLine(); // consume newline

        Person[] people = new Person[numPeople];

        for (int i = 0; i < numPeople; i++) {
            System.out.println("\nEnter details for person " + (i + 1) + ":");
            System.out.print("Name: ");
            String name = scanner.nextLine();
            System.out.print("Age: ");
            int age = scanner.nextInt();
            scanner.nextLine(); // consume newline
            System.out.print("Address: ");
            String address = scanner.nextLine();

            System.out.print("Is this person a staff member or student? (staff/student): ");
            String type = scanner.nextLine();

            if (type.equalsIgnoreCase("staff"))
            {
                System.out.print("Staff ID: ");
                String staffId = scanner.nextLine();
                System.out.print("Department: ");
                String department = scanner.nextLine();

                System.out.print("Is this staff member a professor? (yes/no): ");
                String isProfessor = scanner.nextLine();

                if (isProfessor.equalsIgnoreCase("yes"))
                {
                    System.out.print("Specialization: ");
                    String specialization = scanner.nextLine();
                    people[i] = new Professor(name, age, address, staffId, department, specialization);
                }
                else
                {
                    people[i] = new Staff(name, age, address, staffId, department);
                }
            }
            else if (type.equalsIgnoreCase("student"))
            {
                System.out.print("Student ID: ");
                String studentId = scanner.nextLine();
                System.out.print("Course: ");
                String course = scanner.nextLine();

                System.out.print("Is this student a graduate student? (yes/no): ");
                String isGraduateStudent = scanner.nextLine();

                if (isGraduateStudent.equalsIgnoreCase("yes"))
                {
                    System.out.print("Research Topic: ");
                    String researchTopic = scanner.nextLine();
                    people[i] = new GraduateStudent(name, age, address, studentId, course, researchTopic);
                }
                else
                {
                    people[i] = new Student(name, age, address, studentId, course);
                }
            }
        }

        System.out.println("\nPerson Details:");
        for (Person person : people)
        {
            person.displayInfo();
            if (person instanceof Professor)
            {
                ((Professor) person).conductLecture();
            }
            else if (person instanceof GraduateStudent)
            {
                ((GraduateStudent) person).submitThesis();
            }
            System.out.println();
        }

        scanner.close();
    }
}
