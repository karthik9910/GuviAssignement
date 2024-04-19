package Task2;

import java.util.Scanner;

public class XYZ {
	
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        Product[] products = new Product[5];

	        // Accepting product information from the user
	        for (int i = 0; i < products.length; i++) {
	            System.out.println("Enter Product ID, Price, and Quantity for product " + (i+1) + ":");
	            int pid = scanner.nextInt();
	            double price = scanner.nextDouble();
	            int quantity = scanner.nextInt();
	            products[i] = new Product(pid, price, quantity);
	        }

	        // Finding the PID of the product with the highest price
	        int maxPid = -1;
	        double maxPrice = Double.MIN_VALUE;
	        for (Product product : products) {
	            if (product.getPrice() > maxPrice) {
	                maxPrice = product.getPrice();
	                maxPid = product.getPid();
	            }
	        }
	        System.out.println("Product with the highest price has PID: " + maxPid);

	        // Calculating total amount spent on all products
	        double totalAmountSpent = calculateTotalAmountSpent(products);
	        System.out.println("Total amount spent on all products: " + totalAmountSpent);
	    }

	    // Method to calculate total amount spent on all products
	    public static double calculateTotalAmountSpent(Product[] products) {
	        double totalAmount = 0;
	        for (Product product : products) {
	            totalAmount += product.getPrice() * product.getQuantity();
	        }
	        return totalAmount;
	    }

}
