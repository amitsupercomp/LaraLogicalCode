package NumberSystem;

import java.util.Scanner;

public class GCD 
{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two number to find GCD");
		System.out.println("Enter first number");
		int num1, num2;
		try
		{
			num1 = sc.nextInt();		
			System.out.println("Enter second number");
			num2 = sc.nextInt();
		}
		catch(NumberFormatException es)
		{
			System.out.println("Input appropriate number");
			return;
		}
		finally
		{
			sc.close();
		}
		System.out.println("GCD of "+num1+" , "+num2+" is :::  "+gcdNum(num1, num2));
	}
	
	private static int gcdNum(int num1, int num2)
	{
		int max = max(num1, num2);
		int min = min(num1, num2);
		int temp, gcd=0;
		while(min != 0)
		{
			temp = min;
			if(max % min == 0)
			{
				gcd=min;
				break;				
			}
			min = max % min;
			max=temp;
		}
		return gcd;
	}
	
	private static int max(int num1, int num2)
	{
		return num1>num2?num1:num2;
	}
	
	private static int min(int num1, int num2)
	{
		return num1<num2?num1:num2;
	}

}
