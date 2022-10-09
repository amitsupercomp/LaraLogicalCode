package app5;

import java.util.Scanner;

//Reverse a number by using recursion

public class B
{
	private static void reverse(int number)
	{
		if(number<10)
		{
			System.out.print(number);
			return;
		}
		else
		{
			System.out.print(number%10);
			reverse(number/10);
		}
	}
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to print in reverse order");
		int n=sc.nextInt();
		reverse(n);
		sc.close();	
		
	}
	

}
