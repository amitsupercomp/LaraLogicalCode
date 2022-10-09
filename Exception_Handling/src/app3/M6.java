package app3;

import java.util.Scanner;

public class M6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter one number (even number of digits) ");
		int num = sc.nextInt();
		int count = count(num);
		if(count % 2 == 1)
		{
			System.out.println("Please enter number of even digit");
			System.out.println("Like 1234, 456432, 87654345 etc");
			return;
		}
		boolean isAscending = findOrder(num);
		if(isAscending)
		{
			int firstDigit = getFirstDigit(num);
			int lastDigit = getLastDigit(num);
			System.out.println("First and last digit sum  :::    "+(firstDigit + lastDigit));
			System.out.println("Sum of all digits            :::    "+sum(num));
		}
		else
		{
			int firstHalf = getFirstHalf(num);
			int secondHalf = getSecondHalf(num);
			System.out.println(firstHalf - secondHalf);
		}
	}
	
	private static int sum(int num)
	{
		int sum = 0;
		while(num != 0)
		{
			sum = sum + num % 10;
			num /= 10;
		}
		return sum;
	}
	
	
	static boolean findOrder(int num)
	{
		boolean ascending = true;
		int n1 = num % 10, n2;
		num = num / 10;
		while(num != 0)
		{
			n2 = num % 10;
			if(n2 > n1)
			{
				ascending = false;
				break;
			}
			n1 = n2;
			num = num / 10;
		}
		return ascending;
	}
	static int count(int num)
	{
		int count = 0;
		while(num != 0)
		{
			count ++;
			num = num / 10;
		}
		return count;
	}
	static int getFirstDigit(int num)
	{		
		int count = count(num);
		int factor = getFactor(count - 1);
		return num / factor;
	}
	static int getFactor(int count)
	{
		int factor = 1;
		for(int i = 1; i <= count; i++)
		{
			factor *= 10;
		}
		return factor;
	}
	static int getLastDigit(int num)
	{
		return num % 10;
	}
	
	static int getFirstHalf(int num)
	{
		int count = count(num);
		int factor = getFactor(count / 2);
		return num / factor;
		
	}
	static int getSecondHalf(int num)
	{
		int count = count(num);
		int factor = getFactor(count / 2);
		return num % factor;		
	}
	
	
}