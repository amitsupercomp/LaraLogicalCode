package app1_10;

import java.util.Scanner;

public class A2 
{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number to check it is less than 10 or greater than or equal to 10");
		
		int n=sc.nextInt();
		if(n<10)
			System.out.println("Number is less than 10");
		else if(n==10)
			System.out.println("Number is equal to 10");
		else
			System.out.println("Number is greater than 10");
		
	}

}
