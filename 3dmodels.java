//1.	In a 3D modeling application, define an abstract class named Solid that declares an 
//  abstract method calculateVolume(). Then, derive two concrete classes—Cuboid and Sphere—from 
//the Solid class. Each subclass should override calculateVolume() to compute its volume 
// using the appropriate geometric formula. Finally, in your main method, create objects of Cuboid and Sphere and call their calculateVolume() 
// methods to display the computed volumes.


//PART 1: solid.java

public abstract class Solid {
    public abstract double calculateVolume();
}

//PART 2: Cuboid.java

public class Cuboid extends Solid {
    private double length;
    private double width;
    private double height;

    public Cuboid(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    @Override
    public double calculateVolume() {
        return length * width * height;
    }
}

//PART 3: Sphere.java

public class Sphere extends Solid {
    private double radius;

    public Sphere(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateVolume() {
        return (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
    }
}

//PART 4: Cylinder.java

public class Cylinder extends Solid {
    private double radius;
    private double height;

    public Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    @Override
    public double calculateVolume() {
        return Math.PI * Math.pow(radius, 2) * height;
    }
}

//part 5: Cone.java

public class Cone extends Solid {
    private double radius;
    private double height;

    public Cone(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    @Override
    public double calculateVolume() {
        return (1.0 / 3.0) * Math.PI * Math.pow(radius, 2) * height;
    }
}

//PART 6: Main.java

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the dimensions for the Cuboid:");
        System.out.print("Length: ");
        double length = scanner.nextDouble();
        System.out.print("Width: ");
        double width = scanner.nextDouble();
        System.out.print("Height: ");
        double height = scanner.nextDouble();
        Solid cuboid = new Cuboid(length, width, height);

        System.out.println("Enter the radius for the Sphere:");
        System.out.print("Radius: ");
        double sphereRadius = scanner.nextDouble();
        Solid sphere = new Sphere(sphereRadius);

        System.out.println("Enter the dimensions for the Cylinder:");
        System.out.print("Radius: ");
        double cylinderRadius = scanner.nextDouble();
        System.out.print("Height: ");
        double cylinderHeight = scanner.nextDouble();
        Solid cylinder = new Cylinder(cylinderRadius, cylinderHeight);

        System.out.println("Enter the dimensions for the Cone:");
        System.out.print("Radius: ");
        double coneRadius = scanner.nextDouble();
        System.out.print("Height: ");
        double coneHeight = scanner.nextDouble();
        Solid cone = new Cone(coneRadius, coneHeight);

        System.out.println("Cuboid Volume: " + cuboid.calculateVolume());
        System.out.println("Sphere Volume: " + sphere.calculateVolume());
        System.out.println("Cylinder Volume: " + cylinder.calculateVolume());
        System.out.println("Cone Volume: " + cone.calculateVolume());

        scanner.close();
    }
}
