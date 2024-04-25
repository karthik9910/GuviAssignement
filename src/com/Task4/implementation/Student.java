package com.Task4.implementation;

import java.util.Scanner;

import com.Task4.ExceptionFiles.AgeNotWithinRangeException;
import com.Task4.ExceptionFiles.NameNotValidException;

public class Student {
	
	//Attributes
	int rollNo;
	String name;
	int age;
	String course;
	
	
	//Parameterized Constructor, throw with user defined exceptions
	public Student(int rollNo, String name, int age, String course)  throws AgeNotWithinRangeException, NameNotValidException {
		
		// Initialing the values
		this.rollNo = rollNo;
		this.name = name;
		this.age = age;
		this.course = course;

		// condition for Age must be between 15 to 21
		if(age<15 || age>21) {
			//generate user defined exception for  Age Not Within Range Exception
			throw new AgeNotWithinRangeException("Age should be between 15 and 21");
		} else {
			System.out.println("Age is within the 15 and 21");
		}
	
	
		// condition for name should not contain numbers and special characters
    	if(!name.matches("[a-zA-Z ]+")) {
    		//generate user defined exception for Name Not Valid Exception
			throw new NameNotValidException("Name should not contain numbers and special characters");
		} else {
			System.out.println("Provided valid name");
		}
	}
	
	
	public static void main(String[] args)  throws AgeNotWithinRangeException, NameNotValidException{
		//Scanner class for user provide input
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter the roll number: ");
		int rollNo=sc.nextInt();
		System.out.println("Enter the name: ");
		String name=sc.next();
		System.out.println("Enter the age: ");
		int age=sc.nextInt();
		System.out.println("Enter the course: ");
		String course=sc.next();
		
		// creating a object for above class
		Student studentDetails=new Student(rollNo, name, age, course);
		
	}
	

}
