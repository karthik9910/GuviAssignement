package com.Task4.implementation;

import java.util.Scanner;

public class Weekdays {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String weekdays[]= {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
		System.out.println("Enter the day position 0 to 6: ");
		try {
			String weekdayPosition=weekdays[sc.nextInt()];
			System.out.print("The day is: " + weekdayPosition);
		} catch (ArrayIndexOutOfBoundsException e) {
			// TODO: handle exception
			System.out.println("Invalid day position, enter 1 to 6: " + e);
		}
		
	}	    

}
