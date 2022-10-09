package NumberSystem;

import java.util.Scanner;

public class Perfect
{
	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number to check whether it is Perfect number or not");
		int num=0;
		try
		{
			num = sc.nextInt();
		}
		catch(Exception e)
		{
			System.out.println(" I cought   :::    "+e);
		}
		finally
		{
			sc.close();
		}
		System.out.println("Number "+num+" is "+perfectCheck(num));
				
	}
	
	private static String perfectCheck(int num)
	{
		int perfect = 0;
		
		for(int i=1; i <= num/2 ; i++)
		{
			if(num % i == 0)
				perfect += i;
		}
		if(perfect == num)
			return "Perfect Number";
		else
			return "NOT Perfect Number";
		
	}

}
