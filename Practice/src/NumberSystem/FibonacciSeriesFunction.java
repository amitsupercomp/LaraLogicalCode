package NumberSystem;

import java.util.Scanner;

public class FibonacciSeriesFunction 
{
	FibonacciSeriesFunction(int count)
	{
		fibonacciSeries(count);
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number n where n is natural number to print upto n term fibonacci Series");
		int count = sc.nextInt();
		FibonacciSeriesFunction lc = new FibonacciSeriesFunction(count);
		sc.close();
	}

	private void fibonacciSeries(int count)
	{
		int num1 	= 0, 	num2 = 1;
		if(count<1)
		{
			System.out.println("Please Enter a number from 1 to n \n Try again....");
			return;
		}
		else if(count 	== 	1)
		{
			System.out.print(num1);
			return;
		}

		else if(count		==	 2)
		{
			System.out.print(num1 + ",  " + num2);
			return;
		}
		else
		{
			System.out.print(num1 + ", " + num2);
			for(int i=3 ;  i<=count 	;  i++)
			{
				num2	=	num2	+	num1;
				num1	=	num2	-	num1;
				System.out.print(", "+num2);
			}
		}
	}
}
