import java.util.List;
import java.util.Scanner;

public class Admin extends User {
    public Admin(String userId, String name) {
        super(userId, name);
    }

    public void performAction(List<Product> productList, Scanner scanner) {
        boolean continueAdminActions = true;

        while (continueAdminActions) {
            System.out.println("\nAdmin Options:");
            System.out.println("1. Add Product");
            System.out.println("2. View Products");
            System.out.println("3. Exit Admin Menu");
            System.out.print("Enter your choice: ");
            int adminChoice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (adminChoice) {
                case 1:
                    addProduct(productList, scanner);
                    break;

                case 2:
                    displayProducts(productList);
                    break;

                case 3:
                    continueAdminActions = false;
                    System.out.println("Exiting Admin Menu.");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private void addProduct(List<Product> productList, Scanner scanner) {
        System.out.print("Enter Product ID: ");
        String productId = scanner.nextLine();
        System.out.print("Enter Product Name: ");
        String productName = scanner.nextLine();
        System.out.print("Enter Product Price: ");
        double price = scanner.nextDouble();
        scanner.nextLine(); // Consume newline

        Product newProduct = new Product(productId, productName, price);
        productList.add(newProduct);
        System.out.println("Product added: " + newProduct.getProductName());
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
}
