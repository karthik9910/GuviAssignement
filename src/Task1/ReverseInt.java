package Task1;

import java.util.Scanner;

public class ReverseInt {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Input= ");
		int a=sc.nextInt();
		int r=0;
		while(a!=0) {
			int digit= a%10;
			r=digit+r*10;
			a=a/10;
		}
		System.out.print("Output= "+r);
	}

}
