//2.	Develop an abstract class called Worker with two abstract methods: computePay() and displayInfo(). 
// Next, create two subclasses named FullTimeWorker and PartTimeWorker that extend Worker. 
// Implement the computePay() method in each subclass—for example, by calculating a fixed monthly wage for full-time workers 
// and an hourly rate for part-time workers—and implement displayInfo() to print out the worker’s details. 
// In your main method, instantiate objects of both subclasses and test their functionality to demonstrate polymorphism and code reuse.

//part 1

public abstract class Worker {
    public abstract double computePay();
    public abstract void displayInfo();
}

//part 2
public class FullTimeWorker extends Worker {
    private String name;
    private double monthlyWage;

    public FullTimeWorker(String name, double monthlyWage) {
        this.name = name;
        this.monthlyWage = monthlyWage;
    }

    @Override
    public double computePay() {
        return monthlyWage;
    }

    @Override
    public void displayInfo() {
        System.out.println("Full-Time Worker: " + name);
        System.out.println("Monthly Wage: $" + monthlyWage);
    }
}

//part 3

public class PartTimeWorker extends Worker {
    private String name;
    private double hourlyRate;
    private int hoursWorked;

    public PartTimeWorker(String name, double hourlyRate, int hoursWorked) {
        this.name = name;
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double computePay() {
        return hourlyRate * hoursWorked;
    }

    @Override
    public void displayInfo() {
        System.out.println("Part-Time Worker: " + name);
        System.out.println("Hourly Rate: $" + hourlyRate);
        System.out.println("Hours Worked: " + hoursWorked);
    }
}

//part 4


public class WorkerManagement {
    public static void main(String[] args) {
        Worker fullTimeWorker = new FullTimeWorker("Alice", 3000);
        Worker partTimeWorker = new PartTimeWorker("Bob", 20, 80);
        System.out.println("Worker Management System")
        fullTimeWorker.displayInfo();
        System.out.println("Computed Pay: $" + fullTimeWorker.computePay());

        partTimeWorker.displayInfo();
        System.out.println("Computed Pay: $" + partTimeWorker.computePay());
    }
}

