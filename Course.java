//4. A student is developing a course registration system that allows students to enroll in courses.
//Each course has a course name and a course code.
//Implement a Course class with appropriate attributes and use the “this” keyword to
//differentiate between class attributes and constructor parameters during initialization.
//Create an object of the Course class and display the course details.

public class Course
{
    private String courseName;
    private String courseCode;

    // constructor to initialize course attributes
    public Course(String courseName, String courseCode)
    {
        this.courseName = courseName;
        this.courseCode = courseCode;
    }

    // method to display course details
    public void displayCourseDetails() {
        System.out.println("Course Name: " + this.courseName);
        System.out.println("Course Code: " + this.courseCode);
    }

    public static void main(String[] args)
    {
        // create an object of the course class
        Course course = new Course("Introduction to Programming", "CS101");

        // display the course details
        course.displayCourseDetails();
    }
}
