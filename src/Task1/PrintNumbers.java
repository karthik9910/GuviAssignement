package Task1;

import java.util.Scanner;

public class PrintNumbers {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the a value: ");
		int a=sc.nextInt();
		while(a<=50) {
			System.out.print(a + " ");
			a++;
		}
	}

}
