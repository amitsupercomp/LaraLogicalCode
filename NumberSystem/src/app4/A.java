package app4;

import java.util.Scanner;

public class A 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number to check prime");
		int num=sc.nextInt();
		int flag=0;
		for(int i=2 ; i<num; i++)
		{
			if(num%i==0)
			{
				flag=1;
				break;
			}
		}
		if(flag==0)
			System.out.println(" Number is prime");
		else
			System.out.println("number is not prime");
		
		boolean isPrime=true;
		for(int i=2; i<=num/2; i++)
		{
			if(num%i==0)
			{
				isPrime=false;
				break;
			}
		}
		System.out.println(num+ " is "+(isPrime?"prime": "not a prime"));
		
	}

}
