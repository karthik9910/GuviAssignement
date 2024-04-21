package Task3;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		while(true) {
			System.out.println("Enter 1 to income tax calculation / 2 to sales tax calculation: ");
			int options=sc.nextInt();
			if(options==1) {
				System.out.println("****************Income Tax*************************");
				System.out.println("Enter employee id, name, salary per year: ");
				Employee employeeDetails =new Employee(sc.nextInt(), sc.next(), sc.nextDouble());
				System.out.println("*****************************************");
				System.out.println("Employee ID: "+employeeDetails.getEmpId());
				System.out.println("Employee Name: "+employeeDetails.getName());
				System.out.println("Employee Annual Income: "+employeeDetails.getYearlyIncome());
				employeeDetails.calcTax();
				break;
			} else if (options==2) {
				System.out.println("****************Sales Tax*************************");
				System.out.println("Enter product id, price, quantity: ");
				Product productDetails=new Product(sc.nextInt(), sc.nextDouble(), sc.nextInt());
				System.out.println("*****************************************");
				System.out.println("PID: "+productDetails.getPid());
				System.out.println("Product price: "+productDetails.getPrice());
				System.out.println("No of Quantity: "+productDetails.getQuantity());
				productDetails.calcTax();		
				break;
			} else {
				System.out.println("Invalid options");
			}
		}
		
		
		
		
		
	}

}
