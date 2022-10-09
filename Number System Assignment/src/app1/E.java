package app1;

import java.util.Scanner;

public class E 
{
	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to check a prime");
		int num=sc.nextInt();
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
		sc.close();
	}

}
