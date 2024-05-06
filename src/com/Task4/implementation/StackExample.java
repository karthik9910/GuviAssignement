package com.Task4.implementation;

import java.util.Scanner;
import java.util.Stack;

public class StackExample {
	static Stack<Integer> stack=new Stack<Integer>();
	
	
	public static void main(String[] args) {
		StackExample se=new StackExample();
		Scanner sc=new Scanner(System.in);
		stack=new Stack<Integer>();
		while(true) {
			System.out.println("Enter 1.add, 2.remove, 3.check the list is empty: ");
			int option=sc.nextInt();
			if(option==1) {
				System.out.print("Enter the integer value to be added in the stack: ");
				int value=sc.nextInt();
				se.pushElement(value);
				System.out.println(stack);
				System.out.println();
			} else if(option==2) {
				System.out.println("Before popping the element stack: ");
				System.out.print(stack);
				se.popElement();
				System.out.println("After popping the element in the stack: ");
				System.out.print(stack);
				System.out.println();
			} else if(option==3) {
				se.checkIsEmpty();
				System.out.println();
			} else {
				System.out.println("Invalid Entry");
				System.out.println();
			}
		}
		
		
	}
	
	void pushElement(int element) {
		stack.push(element);
		
	}
	
	void popElement() {
		stack.pop();
	}
	
	void checkIsEmpty() {
		boolean checkIsEmpty=stack.empty();
		if(checkIsEmpty==true) {
			System.out.println("Empty List, add value to the list");
		} else {
			System.out.println("Stack with the elements " + stack);
		}
	}

}
