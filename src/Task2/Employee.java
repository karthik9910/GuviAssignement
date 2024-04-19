package Task2;

import java.util.Scanner;

public class Employee extends Person4Q {
	
	int employeeId;
	double salary;
	
	
	public Employee(String name, int age, int employeeID, double salary) {
		super(name, age);
		this.employeeId=employeeID;
		this.salary=salary;
		// TODO Auto-generated constructor stub
		
		
	}
	
	void displayDetails() {
		System.out.println("*************************************" );
		System.out.println(super.name + "  " +super.age + "  " +employeeId + "  "+salary);
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the employee details: " );
		Employee employee =new Employee(sc.next(), sc.nextInt(), sc.nextInt(), sc.nextDouble());
		employee.displayDetails();
	}

}
