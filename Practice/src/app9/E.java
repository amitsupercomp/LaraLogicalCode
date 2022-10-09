package app9;

import java.util.Scanner;

public class E 
{
	
	private static int lcmNumber(int a, int b)
	{
		if(b==0)
			return a;
		if(a==0)
			return b;
		int lcm;
		lcm=(a*b)/gcdNum(a,b);
		return lcm;
	}
	
	private static int gcdNum(int a, int b)
	{
		if(b==0)
			return a;
		return gcdNum(b, a%b);
	}
	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number");
		int a=sc.nextInt();
		System.out.println("Enter a second Number");
		int b=sc.nextInt();
		System.out.println("Lcm of both number is  ::::    "+lcmNumber(a,b));
		System.out.println("Gcd of both number is  ::::    "+gcdNum(a,b));
		
		sc.close();
		
	}

}
