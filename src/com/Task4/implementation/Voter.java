package com.Task4.implementation;

import java.util.Scanner;

import com.Task4.ExceptionFiles.InvalidAgeForVoteException;

public class Voter {
	
	int voterID;
	String name;
	int age;
	
	public Voter(int voterID, String name, int age) throws InvalidAgeForVoteException {
		this.voterID = voterID;
		this.name = name;
		this.age = age;
		
		if(age<18) {
			throw new InvalidAgeForVoteException("invalid age for vote");
		} else {
			System.out.print("Valid age to vote");
		}
	}
	
	public static void main(String[] args) throws InvalidAgeForVoteException {
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter the voter id: ");
		int voterID=sc.nextInt();
		System.out.println("Enter the voter name: ");
		String name=sc.next();
		System.out.println("Enter the voter age: ");
		int age=sc.nextInt();
		Voter voterDetails= new Voter(voterID, name, age);
	}
	
	

}
