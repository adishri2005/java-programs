//1.Create a Book class with attributes title and author.
//Assign default values (e.g., "Untitled", "Unknown Author").
//Accept user-defined values for title and author.
//Add another constructor that also includes an integer parameter for publicationYear.
//Objective: Create multiple Book objects using the different constructors and display their details.


import java.util.Scanner;

public class Book {
    private String title;
    private String author;
    private int publicationYear;

    // default constructor
    public Book()
    {
        this.title = "Untitled";
        this.author = "Unknown Author";
        this.publicationYear = -1; // default value indicating no publication year
    }

    // constructor w/ title and author
    public Book(String title, String author)
    {
        this.title = title;
        this.author = author;
        this.publicationYear = -1; // default value indicating no publication year
    }

    // constructor with title, author, and publication year
    public Book(String title, String author, int publicationYear)
    {
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
    }

    // method to display book details
    public void displayDetails()
    {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        if (publicationYear != -1) {
            System.out.println("Publication Year: " + publicationYear);
        } else {
            System.out.println("Publication Year: Not specified");
        }
        System.out.println();
    }

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("BOOKS MANAGER");
        System.out.print("Enter the number of books: ");
        int numberOfBooks = scanner.nextInt();
        scanner.nextLine(); // consume newline

        Book[] books = new Book[numberOfBooks];

        for (int i = 0; i < numberOfBooks; i++)
        {
            System.out.println("Enter details for book " + (i + 1) + ":");
            System.out.print("Enter title (or press Enter for default): ");
            String title = scanner.nextLine();
            System.out.print("Enter author (or press Enter for default): ");
            String author = scanner.nextLine();
            System.out.print("Enter publication year (or press Enter for default): ");
            String yearInput = scanner.nextLine();

            if (title.isEmpty() && author.isEmpty() && yearInput.isEmpty())
            {
                books[i] = new Book();
            }
            else if (yearInput.isEmpty())
            {
                books[i] = new Book(title.isEmpty() ? "Untitled" : title, author.isEmpty() ? "Unknown Author" : author);
            }
            else
            {
                int publicationYear = Integer.parseInt(yearInput);
                books[i] = new Book(title.isEmpty() ? "Untitled" : title, author.isEmpty() ? "Unknown Author" : author, publicationYear);
            }
        }

        System.out.println("\nBook Details:");
        for (Book book : books) {
            book.displayDetails();
        }

        scanner.close();
    }
}
