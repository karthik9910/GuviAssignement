package com.Task4.implementation;

import java.util.HashMap;
import java.util.Scanner;

public class StudentGradeSystem {
	HashMap<String, Integer> hashmap =new HashMap(5);
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		StudentGradeSystem sgs=new StudentGradeSystem();
		sc=new Scanner(System.in);
		
		while(true) {
			System.out.println("Enter 1- add, 2-remove, 3-display student grade detail:");
			int a=sc.nextInt();
			String name;
			if(a==1) {
				System.out.print("Enter the Student name: ");
				name=sc.next();
				System.out.print("Enter the Student grade: ");
				int grade=sc.nextInt();
				sgs.addNewStudent(name, grade);
				System.out.println();
			} else if (a==2) {
				System.out.print("Enter the Student name to remove student from the list: ");
				name=sc.next();
				sgs.removeStudent(name);
				System.out.println();
			} else if (a==3) {
				System.out.print("Enter the Student name to display his/her grade: ");
				name=sc.next();
				sgs.displayStudentGrade(name);
			} else {
				System.out.println("Invalid entry");
				break;
			}
		
		}
		
		
	}
	
	
	void addNewStudent(String name, int grade) {
	
		hashmap.put(name, grade);
		
	}
	
	void removeStudent(String name) {
		Integer removeStudent=hashmap.remove(name);
		if(removeStudent!=null) {
			System.out.println("Student details removed from the list" + removeStudent);
		} else {
			System.out.println("Student name is not in the list!!!");
		}
		
	}
	
	void displayStudentGrade(String name) {
		Integer studentGrade=hashmap.getOrDefault(name, -1);// -1 will return if student name is not in the list 
		if(studentGrade==-1) {
		 System.out.println("Student name is not in the list!!!");
		 System.out.println();
		} else {
			System.out.println("Grade of the student is: " +studentGrade);
		}
		
	}

}
