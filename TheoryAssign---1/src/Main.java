
import java.util.Scanner;
import java.util.InputMismatchException;

public class Main {
    public static void main(String[] args) {
        Product p1 = new Table("Erus", 1200, 13, 100, "wood", 4, "Round");
        System.out.println(p1);
        ProductManagement pm = new ProductManagement(23);
        pm.AddProduct(p1);
        Product p2 = new Laptop("Thinkpad", 55000, 7, 1200, 10, 1.5, "intel", "8 gb", "8 by 8");
        pm.AddProduct(p2);
        Product p3 = new Laptop("Mac", 120000, 0, 1000, 20, 1.5, "OS", "16 gb", "8 by 8");
        pm.AddProduct(p3);
        pm.outOfStock(p3);
        pm.outOfStockReport();
        pm.removeProduct(p1);
        pm.generateReport();
        pm.AddProduct(p1);
        pm.AddProduct(p2);
        pm.stockRunningLowReport();

        Scanner input = new Scanner(System.in);


        Laptop lap = new Laptop("MacOS", 50000.0, 10, 1.98,
                2000.4, 2.5, "i5", "4gb",
                "4 inches by 5 inches");


        Laptop laptop = new Laptop("Hp", 20000.0, 20, 1.98,
                2000.4, 2.5, "i5", "4 gb",
                "4 inches by 5 inches");


        Laptop laptop2 = new Laptop("Android", 20000.0, 20, 1.98,
                2000.4, 2.5, "i5", "4 gb",
                "4 inches by 5 inches");


        pm.fetchProductById(2);

        int value;
        do {
            System.out.println("Select from Menu:\npress\n1 for search\n" +
                    "2 for update\n3 for display product details\n" +
                    "-1 to exit\n................");
            try {
                value = input.nextInt();
                if (value == 1) {
                    System.out.println("Fetch by id...");
                    try {
                        int id = input.nextInt();
                        pm.fetchProductById(id); // Corrected the parameter
                    } catch (InputMismatchException ee) {
                        System.out.println("Invalid Input. Try again...");
                    }
                } else if (value == 2) {
                    System.out.println("Update product price or quantity by id.....");
                    try {
                        int id = input.nextInt();
                        pm.updateProductPrice(id, 200000);
                    } catch (InputMismatchException ee) {
                        System.out.println("Invalid Input. Try again...");
                    }
                } else if (value == 3) {
                    System.out.println("Display list of products.....");
                    pm.generateReport();
                } else if (value == -1) {
                    System.out.println("Exiting the program...");
                } else {
                    System.out.println("Invalid Input. Try again....");
                }
            } catch (InputMismatchException e) {
                System.out.println("Incorrect Input. Try again with Integer...");
                input.next();
                value = 0;
            }
        } while (value != -1);
    }
}
