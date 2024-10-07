import java.util.Scanner;

public class LoginPage {

    // Predefined username and password
    private static final String USERNAME = "admin";
    private static final String PASSWORD = "password123";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Login Page!");

        // Input username
        System.out.print("Enter username: ");
        String inputUsername = scanner.nextLine();

        // Input password
        System.out.print("Enter password: ");
        String inputPassword = scanner.nextLine();

        // Check if the input matches the predefined credentials
        if (inputUsername.equals(USERNAME) && inputPassword.equals(PASSWORD)) {
            System.out.println("Login successful!");
        } else {
            System.out.println("Login failed! Incorrect username or password.");
        }
         scanner.close();
    }
}
