//4) A security system needs to protect its authentication mechanism to prevent 
//tampering. Implement a final class named SecuritySystem that includes a 
//method authenticateUser(String username, String password), which verifies
//user credentials. Then, attempt to create a subclass AdvancedSecurity that tries to extend
//SecuritySystem and override authenticateUser(). Observe the compilation error and explain why
//a final class cannot be inherited. In the main() method, create an instance
//of SecuritySystem and use the authenticateUser() method to validate login credentials.
//This will demonstrate how the final
//keyword enforces security by preventing unauthorized modifications to authentication logic.

import java.util.Scanner;

//PART 1:
public final class SecuritySystem 
{
    private String validUsername = "admin";
    private String validPassword = "password123";

    public boolean authenticateUser(String username, String password) {
        return validUsername.equals(username) && validPassword.equals(password);
    }
}

//PART 2:

// This caused a compilation error
// public class AdvancedSecurity extends SecuritySystem {
//     @Override
//     public boolean authenticateUser(String username, String password) {
//         // Custom authentication logic
//         return false;
//     }
// }


//PART 3:

import java.util.Scanner;

public class SecuritySys {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SecuritySystem securitySystem = new SecuritySystem();
        System.out.println("SECURITY SYSTEM\n");
        System.out.print("Enter username: ");
        String username = scanner.nextLine();

        System.out.print("Enter password: ");
        String password = scanner.nextLine();

        boolean isAuthenticated = securitySystem.authenticateUser(username, password);
        if (isAuthenticated) {
            System.out.println("Authentication successful!");
        } else {
            System.out.println("Authentication failed!");
        }

        scanner.close();
    }
}
