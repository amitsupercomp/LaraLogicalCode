package app5;

import java.util.Scanner;

public class C 
{
	
	static int revNum;
	static int lastDigit;
	
	private static int reverseNumber(int num)
	{
		if(num<10)
		{
			revNum=revNum*10+num;
			return revNum;
		}
		else
		{
			lastDigit = num%10;
			revNum=revNum*10+lastDigit;
			return reverseNumber(num/10);
		}
		
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a number to print in reverse");
		int num= sc.nextInt();
		System.out.println("Number is                ::::   "+num);
		System.out.println("Number in reverse   ::::    "+reverseNumber(num));
	}

}
