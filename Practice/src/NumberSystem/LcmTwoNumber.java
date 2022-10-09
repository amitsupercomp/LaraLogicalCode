package NumberSystem;

import java.util.InputMismatchException;
import java.util.Scanner;

public class LcmTwoNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a two number to find LCM");
		int num1=0, num2=0;
		try
		{
			num1	=	sc.nextInt();
			num2	=	sc.nextInt();
		}
		catch(NumberFormatException ex)
		{
			System.out.println(ex);
			System.out.println("Please enter a value in number format");
			System.exit(0);
		}
		catch(InputMismatchException ex)
		{
			System.out.println(ex);
			System.out.println("Please enter a value in number format");
			System.exit(0);
		}
		
		System.out.println("Lcm of "+num1+" and "+num2+" is :::   "+lcmNumber(num1, num2));
		sc.close();
		
	}
	private static int lcmNumber(int num1, int num2)
	{
		if(num1 == 0 && num2 == 0)
		{
			System.out.println("Please enter an appropriate number from 1 to n");
			System.exit(0);
		}
		int lcm;
		int max= num1>num2?num1:num2;
		for(lcm=max; lcm<=num1*num2; lcm++)
			if(lcm%num1	== 0 &&	lcm%num2	==	0)
				break;
		return lcm;
	}

}
