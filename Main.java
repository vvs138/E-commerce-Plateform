import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static final String ADMIN_ID = "ADMIN001"; // Predefined Admin ID
    private static List<Product> productList = new ArrayList<>(); // List to hold products

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Are you an Admin or Customer? (Enter 'admin' or 'customer', or 'exit' to quit)");
            String userType = scanner.nextLine().toLowerCase();

            if (userType.equals("admin")) {
                handleAdmin(scanner);
            } else if (userType.equals("customer")) {
                handleCustomer(scanner);
            } else if (userType.equals("exit")) {
                System.out.println("Exiting the application.");
                break;
            } else {
                System.out.println("Invalid user type. Please try again.");
            }
        }

        scanner.close();
    }

    private static void handleAdmin(Scanner scanner) {
        System.out.print("Enter Admin ID: ");
        String enteredId = scanner.nextLine();

        if (enteredId.equals(ADMIN_ID)) {
            System.out.println("Admin access granted.");
            Admin admin = new Admin(enteredId, "Admin User");
            admin.performAction(productList, scanner);
        } else {
            System.out.println("Access Denied. You are not the Admin.");
        }
    }

    private static void handleCustomer(Scanner scanner) {
        System.out.println("Customer access granted.");
        Customer customer = new Customer("C001", "Customer User");
        customer.performAction(productList, scanner);
    }
}
