package Task1;

import java.util.Scanner;

public class NegativeAndPositiveNumber {
	
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter the negative/positive value: ");
		double a= sc.nextDouble();
		if(a>0) {
			System.out.print("Positive Number: "+a);
		} else if (a<0) {
			System.out.print("Negative Number: "+a);
		} else if(a==0){
			System.out.print("Zero");
		}
	}

}
