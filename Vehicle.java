//4. Design an abstract class named Vehicle with abstract methods such as startEngine() and stopEngine(),
//as well as a non-abstract method serviceInfo() that prints basic servicing instructions.
//Include a couple of protected or private fields (e.g., make, model) and a constructor for Vehicle that initializes those fields.
//Create a concrete class Car that extends Vehicle and provides implementations for startEngine() and stopEngine().
//Within these methods, include print statements or logic that simulates starting and stopping a car engine.
//Finally, instantiate a Car object in the main method, call all available methods (including the inherited non-abstract method),
//and verify that your abstraction works as intended.

//PART 1
public abstract class Vehicle
{
    protected String make;
    protected String model;

    // constructor to initialize make and model
    public Vehicle(String make, String model)
    {
        this.make = make;
        this.model = model;
    }

    // abstract methods
    public abstract void startEngine();
    public abstract void stopEngine();

    // non-abstract method
    public void serviceInfo()
    {
        System.out.println("Basic servicing instructions for " + make + " " + model + ":");
        System.out.println("1. Check engine oil.");
        System.out.println("2. Check tire pressure.");
        System.out.println("3. Check brake fluid.");
        System.out.println("4. Check coolant level.");
    }
}

//PART 2:
//#src/Vehicle.java continued (part 2)

public class Car2 extends Vehicle
{

    // constructor to initialize make and model
    public Car2(String make, String model)
    {
        super(make, model);
    }

    // implementation of startEngine method
    @Override
    public void startEngine()
    {
        System.out.println("Starting the engine of the " + make + " " + model + ".");
    }

    // implementation of stopEngine method
    @Override
    public void stopEngine()
    {
        System.out.println("Stopping the engine of the " + make + " " + model + ".");
    }
}

//PART 3:
//#src/Vehicle.java continued (part 3)

import java.util.Scanner;

public class TestProgramVehicle
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("CAR MANAGEMENT SYSTEM");
        System.out.print("Enter the make of the car: ");
        String make = scanner.nextLine();

        System.out.print("Enter the model of the car: ");
        String model = scanner.nextLine();

        // instantiate a Car object
        Car2 myCar = new Car2(make, model);

        // call all available methods
        myCar.startEngine();
        myCar.stopEngine();
        myCar.serviceInfo();

        scanner.close();
    }
}
