package app1_10;

import java.util.Scanner;

public class A
{
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number to check whether it is even or odd");
		int n=sc.nextInt();
		
		if(n%2==1)
			System.out.println("Number is odd");
		else
			System.out.println("Number is even");
		
	}

}
