//3. Create a Club class with a static variable clubName and a non-static variable memberName.
//Provide a static method displayClubName() to print the club’s name.
//Create multiple Club objects and assign different member names to each.
//Objective: Show how the static variable clubName is shared across all instances,
//while memberName remains unique to each object. Prove this by displaying each member’s name
//alongside the shared club name.


import java.util.Scanner;

public class Club
{
    private static String clubName;
    private String memberName;

    // static method to set the club name
    public static void setClubName(String name)
    {
        clubName = name;
    }

    // static method to display the club name
    public static void displayClubName()
    {
        System.out.println("Club Name: " + clubName);
    }

    // constructor to set the member name
    public Club(String memberName)
    {
        this.memberName = memberName;
    }

    // method to display member details
    public void displayMemberDetails()
    {
        System.out.println("Member Name: " + memberName);
        displayClubName();
    }

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("CLUB MANAGER");
        System.out.print("Enter the club name: ");
        String clubName = scanner.nextLine();
        Club.setClubName(clubName);

        System.out.print("Enter the number of members: ");
        int numberOfMembers = scanner.nextInt();
        scanner.nextLine(); // consume newline

        Club[] members = new Club[numberOfMembers];

        for (int i = 0; i < numberOfMembers; i++)
        {
            System.out.print("Enter name for member " + (i + 1) + ": ");
            String memberName = scanner.nextLine();
            members[i] = new Club(memberName);
        }

        System.out.println("\nClub Members:");
        for (Club member : members)
        {
            member.displayMemberDetails();
        }

        scanner.close();
    }
}