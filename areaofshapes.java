// 3.	Write a program to find the area of a shape (Rectangle, Square, Circle, Triangle)
// using method overloading.

public class areashapes {

    // method area rectangle
    public double calculatearea(double length, double width)
    {
        return length * width;
    }

    // method area square
    public double calculatearea(double side)
    {
        return side * side;
    }

    // method area circle
    public double calculatearea(double radius, boolean iscircle)
    {
        // iscircle pm used to diff this method (for circle cal only)
        return Math.PI * radius * radius;
    }

    // Method area triangle
    public double calculatearea (double base, double height, boolean istriangle)
    {
        // istriangle pm (for tri only)
        return 0.5 * base * height;
    }

    public static void main(String[] args)
    {
        areashapes areaCalculator = new areashapes();
        System.out.println("Area Calculator");

        System.out.println("Area of Rectangle (length=5, width=4): " + areaCalculator.calculatearea(5, 4));
        System.out.println("Area of Square (side=6): " + areaCalculator.calculatearea(6));
        System.out.println("Area of Circle (radius=3): " + areaCalculator.calculatearea(3, true));
        System.out.println("Area of Triangle (base=4, height=5): " + areaCalculator.calculatearea(4, 5, true));
    }
}