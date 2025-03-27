//5) Write a class Person with fields like name and age, implementing Serializable. 
// In your main method, create an instance of Person and serialize it to a file (person.txt) using ObjectOutputStream. 
// Then, read it back using ObjectInputStream and confirm that the deserialized object has the same field values.

import java.io.*;
import java.util.Scanner;

// define the Person class that implements Serializable
class Person implements Serializable
{
    private static final long serialVersionUID = 1L; // unique id for serialization
    private String name;
    private int age;

    // constructor to initialize Person object
    public Person(String name, int age)
    {
        this.name = name;
        this.age = age;
    }

    // getters for name and age
    public String getName()
    {
        return name;
    }

    public int getAge()
    {
        return age;
    }

    // override toString method for easy display of person object
    @Override
    public String toString()
    {
        return "Person{name='" + name + "', age=" + age + "}";
    }
}

public class personserialization
{

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        // prompt user for name and age
        System.out.print("Enter name: ");
        String name = scanner.nextLine();

        System.out.print("Enter age: ");
        int age = scanner.nextInt();

        // create a Person object with user input
        Person person = new Person(name, age);

        // serialize the Person object to a file
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("person.txt")))
        {
            oos.writeObject(person);
            System.out.println("Person object serialized to person.txt");
        }
        catch (IOException e)
        {
            System.out.println("Error: Unable to serialize object.");
            e.printStackTrace();
        }

        // deserialize the Person object from the file
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("person.txt")))
        {
            Person deserializedPerson = (Person) ois.readObject();
            System.out.println("Person object deserialized from person.txt");
            System.out.println("Deserialized Person: " + deserializedPerson);
        }
        catch (IOException | ClassNotFoundException e)
        {
            System.out.println("Error: Unable to deserialize object.");
            e.printStackTrace();
        }

        scanner.close();
    }
}
