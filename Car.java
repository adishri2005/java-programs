//4. Define a Car class with attributes make, model, and year.
//Create a parameterized constructor that uses this keyword to distinguish
//constructor parameters from the class fields (e.g., this.make = make;).
//Instantiate a Car object with specific values (e.g., "Tesla", "Model 3", 2025) and
//display its details, ensuring the correct assignment of attributes using this.

import java.util.Scanner;

public class Car
{
    private String make;
    private String model;
    private int year;

    // parameterized constructor
    public Car(String make, String model, int year)
    {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    // method to display car details
    public void displayDetails()
    {
        System.out.println("Car Make: " + make);
        System.out.println("Car Model: " + model);
        System.out.println("Car Year: " + year);
    }

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("CAR DETAILS INPUT");
        System.out.print("Enter car make: ");
        String make = scanner.nextLine();

        System.out.print("Enter car model: ");
        String model = scanner.nextLine();

        System.out.print("Enter car year: ");
        int year = scanner.nextInt();

        // instantiate car obj with user input
        Car car = new Car(make, model, year);

        // display car details
        System.out.println("\nCar Details:");
        car.displayDetails();

        scanner.close();
    }
}