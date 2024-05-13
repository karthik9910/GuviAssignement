package com.Task5.impl;

import java.util.Arrays;
import java.util.List;

public class Q2 {
	
	public static void main(String[] args) {
		// Create a list of strings
		List<String> list=Arrays.asList("abc", "", "bc", "efg", "abcd", "", "jkl");
		// Print a message indicating the purpose of the operation
		System.out.println("Check whether string in the list is empty and print the list with non-empty strings:");
		
		// Use Stream API to filter out empty strings and print non-empty strings
		list.stream().filter(s->!s.isEmpty()).forEach(s->System.out.println(s));
	}

}
