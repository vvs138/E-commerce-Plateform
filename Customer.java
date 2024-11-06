import java.util.List;
import java.util.Scanner;

public class Customer extends User {
    public Customer(String userId, String name) {
        super(userId, name);
    }

    public void performAction(List<Product> productList, Scanner scanner) {
        boolean continueCustomerActions = true;

        while (continueCustomerActions) {
            System.out.println("\nCustomer Options:");
            System.out.println("1. View Products");
            System.out.println("2. Purchase Product");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            int customerChoice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (customerChoice) {
                case 1:
                    displayProducts(productList);
                    break;

                case 2:
                    purchaseProduct(productList, scanner);
                    break;

                case 3:
                    continueCustomerActions = false;
                    System.out.println("Thank you for visiting!");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private void displayProducts(List<Product> productList) {
        if (productList.isEmpty()) {
            System.out.println("No products available.");
        } else {
            System.out.println("Available Products:");
            for (Product product : productList) {
                System.out.println("Product ID: " + product.getProductId() + ", Name: " + product.getProductName() + ", Price: " + product.getPrice());
            }
        }
    }

    private void purchaseProduct(List<Product> productList, Scanner scanner) {
        System.out.print("Enter Product ID to purchase: ");
        String productId = scanner.nextLine();
        for (Product product : productList) {
            if (product.getProductId().equalsIgnoreCase(productId)) {
                System.out.println("You have selected: " + product.getProductName() + " for $" + product.getPrice());
                System.out.println("Select Payment Method:");
                System.out.println("1. UPI");
                System.out.println("2. Credit Card");
                System.out.println("3. Debit Card");
                System.out.print("Enter your choice: ");
                int paymentChoice = scanner.nextInt();
                scanner.nextLine(); // Consume newline
                switch (paymentChoice) {
                    case 1:
                        System.out.print("Enter UPI ID: ");
                        String upiId = scanner.nextLine();
                        System.out.println("Payment of $" + product.getPrice() + " made successfully via UPI (ID: " + upiId + ").");
                        break;
                    case 2:
                        System.out.print("Enter Credit Card Number: ");
                        String ccNumber = scanner.nextLine();
                        System.out.println("Payment of $" + product.getPrice() + " made successfully via Credit Card (Number: " + ccNumber + ").");
                        break;
                    case 3:
                        System.out.print("Enter Debit Card Number: ");
                        String dcNumber = scanner.nextLine();
                        System.out.println("Payment of $" + product.getPrice() + " made successfully via Debit Card (Number: " + dcNumber + ").");
                        break;
                    default:
                        System.out.println("Invalid payment option.");
                }
                return;
            }
        }
        System.out.println("Product not found.");
    }
}
