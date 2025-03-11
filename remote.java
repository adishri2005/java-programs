//1.	Create an interface named Remote with methods powerOn(), powerOff(), and changeChannel(int channel).
// Next, implement this interface in a class called Television, where each method prints a message indicating its action
// (e.g., "TV is now on", "TV is off", "Channel changed to X"). Finally, develop a class with a main method that
// instantiates a Television object and uses a Remote reference to call the methods, thereby demonstrating how polymorphism and
// interface abstraction allow you to control a device through a common interface.

//PART 1:

// interface Remote with methods to control a television
public interface Remote 
{
    void powerOn();
    void powerOff();
    void changeChannel(int channel);
}

//PART 2:

// class television implementing remote interface
public class Television implements Remote 
    {
    // method to power on the television
    @Override
    public void powerOn()
    {
        System.out.println("TV is now on");
    }

    // method to power off the television
    @Override
    public void powerOff() 
    {
        System.out.println("TV is off");
    }

    // Method to change the television channel
    @Override
    public void changeChannel(int channel) 
    {
        System.out.println("Channel changed to " + channel);
    }
}

//PART 3:

// class RemoteTest with main method to test Television
public class RemoteTest {
    public static void main(String[] args) {
        // create a Television object
        Remote tvRemote = new Television();

        // Use the Remote reference to call the methods
        tvRemote.powerOn();
        tvRemote.changeChannel(5);
        tvRemote.powerOff();
    }
}




