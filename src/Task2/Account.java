package Task2;

import java.util.Scanner;

public class Account {
	
	 static double balance;
	 double amount;

	    // Constructor with no arguments
	    public Account() {
	        balance = 0.0;
	    }

	    // Constructor with arguments
	    public Account(double initialBalance, double amount) {
	        balance = initialBalance;
	        amount = amount;
	    }

	    // Method to deposit amount to the account
	    public void deposit(double amount) {
	        balance += amount;
	        System.out.println("Deposited: Rs " + amount);
	    }

	    // Method to withdraw amount from the account
	    public void withdraw(double amount) {
	        if (balance >= amount) {
	            balance -= amount;
	            System.out.println("Debitted: Rs " + amount);
	        } else {
	            System.out.println("Insufficient funds.");
	        }
	    }

	    // Method to display balance
	    public void displayBalance() {
	        System.out.println("Current Balance: Rs " + balance);
	    }
	    
	    public void displayBalanceI() {
	        System.out.println("Initial Balance: Rs " + balance);
	    }
	    
	    public void displayBalanceA() {
	        System.out.println("After Debitted, Current Balance: Rs " + balance);
	    }

	    public static void main(String[] args) {
	        // Example usage
	    	Scanner sc=new Scanner(System.in);
	        Account acc1 = new Account(); // using no-argument constructor
	        acc1.displayBalanceI(); // displaying initial balance
	        System.out.print("Enter the Deposit Amount: ");
	        acc1.deposit(sc.nextDouble()); // depositing 100
	        acc1.displayBalance(); // displaying balance after deposit
	        System.out.print("Enter the Withdraw Amount: ");
	        acc1.withdraw(sc.nextDouble()); // withdrawing 50
//	        acc1.displayBalance(); // displaying balance after withdrawal
	        double amount =acc1.amount;

	        Account acc2 = new Account(balance, amount); // using constructor with initial balance
	        acc2.displayBalanceA(); // displaying initial balance
	    }

}
