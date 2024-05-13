package com.Task5.impl;

import java.util.ArrayList;
import java.util.List;

public class Q3 {
	
	public static void main(String[] args) {
		  // Create a list of student names
		List<String> student=new ArrayList<String>();
		student.add("Bala");
		student.add("Arun");
		student.add("Ela");
		student.add("karthik");
		student.add("Anu");
		student.add("Balaganesh");
		student.add("Ajay");
		student.add("Ajith");
		student.add("Ragul");
		student.add("Anu");
		
		 // Print a message indicating the purpose of the operation
		System.out.println("Students who will receive special gifts:");
		
		 // Use Stream API to filter out students whose names start with "A" and print their names
		student.stream().filter(s->s.startsWith("A")).forEach(name->System.out.println(name));		
	}

}
