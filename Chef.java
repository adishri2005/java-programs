//5. Imagine you’re designing a restaurant management system where you have a base class
//called Chef with a method makeSpecialDish(). This method simply prints a generic
//message indicating that the chef is making a special dish.
//Next, create three subclasses called ItalianChef, ChineseChef, and MexicanChef—each
//overrides makeSpecialDish() with a distinct print statement, such as
// "Making pasta", "Making dumplings", or "Making tacos".
//In your main method, declare an array or list of Chef references,
//but assign each element to a different subclass (ItalianChef, ChineseChef, MexicanChef).
//Use a loop to call the makeSpecialDish()
//method on each array element and observe how runtime polymorphism ensures
//that the correct subclass version of makeSpecialDish() is invoked.

//PART 1:

public class Chef  //base class
{
    public void makeSpecialDish()
    {
        System.out.println("The chef is making a special dish.");
    }
}

// PART 2:
// #src/Chef.java continued (part 2)
// ItalianChef class extends Chef class.
public class ItalianChef extends Chef
{
    @Override
    public void makeSpecialDish()
    {
        System.out.println("Making pasta.");
    }
}

//PART 3:
// #src/Chef.java continued (part 3)

// ChineseChef class extends Chef class.

public class ChineseChef extends Chef
{
    @Override
    public void makeSpecialDish()
    {
        System.out.println("Making dumplings.");
    }
}

//PART 4:
// #src/Chef.java continued (part 4)

// MexicanChef class extends Chef class.

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MexicanChef extends Chef
{
    @Override
    public void makeSpecialDish()
    {
        System.out.println("Making tacos.");
    }
}

//PART 5:
//#src/Chef.java continued (part 5)

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TestProgramChef
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        List<Chef> chefs = new ArrayList<>();
System.out.println("Chef Management System");
        System.out.println("Enter the number of chefs: ");
        int numChefs = scanner.nextInt();
        scanner.nextLine(); // consume nl

        for (int i = 0; i < numChefs; i++)
        {
            System.out.println("Enter the type of chef (Italian, Chinese, Mexican): ");
            String chefType = scanner.nextLine();

            switch (chefType.toLowerCase())
            {
                case "italian":
                    chefs.add(new ItalianChef());
                    break;
                case "chinese":
                    chefs.add(new ChineseChef());
                    break;
                case "mexican":
                    chefs.add(new MexicanChef());
                    break;
                default:
                    System.out.println("Unknown chef type. Adding a generic chef.");
                    chefs.add(new Chef());
                    break;
            }
        }

        System.out.println("\nSpecial Dishes:");
        for (Chef chef : chefs) {
            chef.makeSpecialDish();
        }

        scanner.close();
    }
}

