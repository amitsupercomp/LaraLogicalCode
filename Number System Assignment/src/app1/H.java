package app1;

import java.util.Scanner;

public class H 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two number to find all the prime number between two numbers");
		System.out.println("Enter first number");
		int num1=sc.nextInt();
		System.out.println("Enter second number");
		int num2=sc.nextInt();
		boolean isPrime;
		while(num1 <= num2)
		{
			isPrime = true;
			for(int i=2; i<=(num1/2); i++)
			{
				if(num1%i==0)
				{
					isPrime=false;
					break;
				}
			}
			if(isPrime)
				System.out.println(num1+" , ");
			num1++;
		}
		
		
		sc.close();
		
	}

}
