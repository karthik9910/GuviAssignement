package Task1;

import java.util.Scanner;

public class Purchase {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the amount: ");
		double purchaseAmount=sc.nextDouble();
		int discount=0;
		double total=0;
		if(purchaseAmount>=1000) {
			discount=20;
			double cal= purchaseAmount * discount /100;
			total=purchaseAmount-cal;
			System.out.println("Final payable amount after discount: " + total);
		} else if (purchaseAmount>=500 && purchaseAmount<1000) {
			discount=10;
			double cal= purchaseAmount * discount /100;
			total=purchaseAmount-cal;
			System.out.println("Final payable amount after discount: " + total);
		} else if (purchaseAmount<500) {
			System.out.println("Final payable amount/ no discount purchase of below 500rs: " + purchaseAmount);
		}
		
	}

}
