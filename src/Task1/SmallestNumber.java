package Task1;

import java.util.Scanner;

public class SmallestNumber {
	
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter a value: ");
		double a= sc.nextDouble();
		System.out.println();
		System.out.print("Enter b value: ");
		double b= sc.nextDouble();
		System.out.println();
		System.out.print("Enter c value: ");
		double c= sc.nextDouble();
		System.out.println();
		double s=a;
		
		if(b<s) {
			s=b;
		} 
		
		if(c<s) {
			s=c;
		}
		
		System.out.print("Smallest Number= "+s);
	}
	

}
