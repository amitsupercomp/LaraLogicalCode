package NumberSystem;

import java.util.Scanner;

public class Factorial 
{
	public static void main(String[] args) 
	{
		
		Scanner sc  =  new Scanner(System.in);
		
		System.out.println("Enter a number to find the factorial");
		long num = sc.nextLong();
		
		System.out.println("Factorial of "+num+"  is   ::::    "+factNum(num));
		
		System.out.println("By using For loop");
		System.out.println("Factorial of "+num+"  is   ::::    "+factNumFor(num));
		sc.close();
		
	}
	static long fact=1;
	private static long factNum(long num)
	{
		if(num == 0 || num == 1)
		{
			return fact;
		}
		else
		{
			fact *= num;
			return  factNum(num-1);
		}
	}
	
	static long fact1=1;
	private static long factNumFor(long num)
	{
		if(num == 0 || num == 1)
		{
			return fact1;
		}
		for(int i =(int) num; i >=  1; i-- )
			fact1 = fact1 * i;
		return fact1;
	}
}
