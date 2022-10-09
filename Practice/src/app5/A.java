package app5;

import java.util.Scanner;

public class A
{	
	public static void main(String[] args)
	{		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a choice that what you want to print....\n");
		System.out.println("Enter S For Square \t and T for triangle");
		char ch=sc.next().charAt(0);
		if(ch=='S' || ch=='s')
		{
			System.out.println(" Enter the size of Square\n");
			int size=sc.nextInt();
			System.out.println("\nEnter a character you want to print for the pattern\n");
			System.out.println("Enter alphabet , Digit or special character ");
			char c=sc.next().charAt(0);
			
		}
		
		else if(ch=='T' || ch=='t')
		{
			
		}
		
		else
		{
			
		}
	}
	
	

}
