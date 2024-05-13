package com.Task5.impl;

import java.util.LinkedList;
import java.util.stream.Stream;

public class Q1 {

	
	public static void main(String[] args) {
		 // Create a Stream of strings
		Stream<String> names=Stream.of("aBc", "d", "ef");
		
		// Use map to convert each string to uppercase and print them
		names.map(String::toUpperCase).forEach(s->System.out.println(s));
	}
}
