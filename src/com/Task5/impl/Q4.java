package com.Task5.impl;



import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;


public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your birthdate (yyyy-mm-dd): ");

        // Parse the input string to LocalDate object
        LocalDate birthdate = LocalDate.parse(sc.next());

        // Get the current date
        LocalDate currentDate = LocalDate.now();

        // Calculate the period between birthdate and current date
        Period age = Period.between(birthdate, currentDate);

        // Print the age
        System.out.println("Your age is: " + age.getYears() + " years, " +
                age.getMonths() + " months, and " +
                age.getDays() + " days.");

    }
}
