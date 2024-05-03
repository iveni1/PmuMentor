import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        UserService userService = new UserService();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Create Account");
            System.out.println("2. Login");
            System.out.println("3. Update Profile");
            System.out.println("4. Exit");
            int choice = scanner.nextInt();

            if (choice == 1) {
                System.out.print("Username: ");
                String username = scanner.next();
                System.out.print("Password: ");
                String password = scanner.next();
                System.out.print("Email: ");
                String email = scanner.next();

                userService.createUser(username, password, email);
                System.out.println("Account created successfully!");
            } else if (choice == 2) {
                System.out.print("Username: ");
                String username = scanner.next();
                System.out.print("Password: ");
                String password = scanner.next();

                if (userService.login(username, password)) {
                    System.out.println("Login successful!");
                } else {
                    System.out.println("Invalid credentials.");
                }
            } else if (choice == 3) {
                System.out.print("Username: ");
                String username = scanner.next();
                System.out.print("New Email: ");
                String newEmail = scanner.next();

                userService.updateProfile(username, newEmail);
                System.out.println("Profile updated successfully!");
            } else if (choice == 4) {
                break;
            } else {
                System.out.println("Invalid choice.");
            }
        }
    }
}
