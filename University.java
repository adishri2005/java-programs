//3. Create a University class that has a static variable universityName and a non-static variable studentName.
//Include a static method to display the university name. Then, create multiple student objects to demonstrate how the
//static variable is shared among all instances, while the non-static variable holds unique values for each object.

public class University
{
    // static variable for university name
    private static String universityName;

    // non-static variable for student name
    private String studentName;

    // constructor to initialize student name
    public University(String studentName)
    {

        this.studentName = studentName;
    }

    // static method to set university name
    public static void setUniversityName(String name)
    {
        universityName = name;
    }

    // static method to display university name
    public static void displayUniversityName()
    {
        System.out.println("University Name: " + universityName);
    }

    // method to display student name
    public void displayStudentName()
    {
        System.out.println("Student Name: " + studentName);
    }

    public static void main(String[] args)
    {
        // set the university name
        University.setUniversityName("University of Petroleum and Energy Studies");

        // create student objects
        University student1 = new University("Aditya");
        University student2 = new University("Vaishnavi");
        University student3 = new University("Arnav");
        University student4 = new University("Vidushi");


        // display university name using static method
        University.displayUniversityName();

        // display student names
        student1.displayStudentName();
        student2.displayStudentName();
        student3.displayStudentName();
        student4.displayStudentName();
    }
}
