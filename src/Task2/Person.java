package Task2;

import java.util.Scanner;

public class Person {
	
	String name;
	int age=18;
	
	Person(String name, int age){
		this.name=name;
		this.age=age;
	}
	
	void displayDetails() {
		System.out.print("Name: "+name +"\n" + "Age: " +age);
	}
	
	public static void main(String[] args) {
		Person person=new Person("Karthik", 25);	
		person.displayDetails();
		
	}

}
