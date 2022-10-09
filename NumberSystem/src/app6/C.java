package app6;

import java.util.Scanner;

public class C 
{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num= sc.nextInt();
		int i = num, factor=1;
		while(i>9)
		{
			factor = factor *10;
			i=i/10;
		}
		int firstDigit = num/factor;
		int lastDigit = num % 10;
		int sum=firstDigit+lastDigit;
		System.out.println(isPrime(sum)?"java": "j2EE");
		
		
	}
	static boolean isPrime(int n)
	{
		boolean isPrime = true;
		for(int j=2; j<=(n/2); j++)
		{
			if(n % j==0)
			{
				isPrime = false;
				break;
			}		
		}
		return isPrime;
	}

}
