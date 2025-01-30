//A company wants to manage a list of products with details such as product ID, name, price, and category. They also want to keep track of the total number of products and calculate the overall stock value.
//Product Class:
//Instance variables: productId, productName, category.
// A private variable price.
//A default constructor setting some default values.
//A parameterized constructor that initializes product details using this to differentiate parameters from class fields.
//A public method getPrice() to access the private price.
//A public method displayProductInfo() to show all details.
//Static Members:
//A static variable totalProducts to count how many Product objects are created.
//A static method displayTotalProducts() to print the total count.
//Method to Calculate Stock Value:
//A method (e.g., calculateStockValue()) to multiply the price by a given quantity (demonstrate method overloading by adding an optional parameter for a discount rate).
//In the main method:
//Create multiple Product objects using both the default and parameterized constructors.
//Call the static method to display the total number of products.
//Display each product’s details, including the price and the calculated stock value for a given quantity.

import java.util.Scanner;

public class Product
{
    private static int totalProducts = 0;
    private int productId;
    private String productName;
    private String category;
    private double price;

    // def constructor
    public Product()
    {
        this.productId = 0;
        this.productName = "Default Product";
        this.category = "Default Category";
        this.price = 0.0;
        totalProducts++;
    }

    // parameterized constructor
    public Product(int productId, String productName, String category, double price)
    {
        this.productId = productId;
        this.productName = productName;
        this.category = category;
        this.price = price;
        totalProducts++;
    }

    // public method to get the price
    public double getPrice()
    {
        return price;
    }

    // public method to display product info
    public void displayProductInfo()
    {
        System.out.println("Product ID: " + productId);
        System.out.println("Product Name: " + productName);
        System.out.println("Category: " + category);
        System.out.println("Price: $" + price);
    }

    // static method to display the total number of products
    public static void displayTotalProducts()
    {
        System.out.println("Total Products: " + totalProducts);
    }

    // method to calculate stock val
    public double calculateStockValue(int quantity)
    {
        return price * quantity;
    }

    // overloaded method to calculate stock val with discount
    public double calculateStockValue(int quantity, double discountRate)
    {
        return price * quantity * (1 - discountRate);
    }

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of products: ");
        int numberOfProducts = scanner.nextInt();
        scanner.nextLine();                               // consume newline

        Product[] products = new Product[numberOfProducts];

        for (int i = 0; i < numberOfProducts; i++)
        {
            System.out.println("Enter details for product " + (i + 1) + ":");
            System.out.print("Product ID: ");
            int productId = scanner.nextInt();
            scanner.nextLine();                                      // consume newline

            System.out.print("Product Name: ");
            String productName = scanner.nextLine();

            System.out.print("Category: ");
            String category = scanner.nextLine();

            System.out.print("Price: ");
            double price = scanner.nextDouble();

            products[i] = new Product(productId, productName, category, price);
        }

        // display total number of products
        Product.displayTotalProducts();

        // display product details and calculate stock val
        for (Product product : products) {
            System.out.println("\nProduct Details:");
            product.displayProductInfo();
            System.out.print("Enter quantity for stock value calculation: ");
            int quantity = scanner.nextInt();
            System.out.println("Stock Value (" + quantity + " units): $" + product.calculateStockValue(quantity));

            System.out.print("Enter discount rate (e.g., 0.10 for 10%): ");
            double discountRate = scanner.nextDouble();
            System.out.println("Stock Value (" + quantity + " units, " + (discountRate * 100) + "% discount): $" + product.calculateStockValue(quantity, discountRate));
        }

        scanner.close();
    }
}