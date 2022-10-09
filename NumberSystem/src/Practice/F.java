package Practice;

import java.util.Scanner;

/** A program to print a fibonacci series....  */

public class F
{
	
	
	/**  Here main function is start which is having a String array as argument.  Program execution is start from main function. */
	
	public static void main(String[] args) 
	{
		
		
		/** Create an Object of Scanner class. Scanner is used for taking an input from user.*/
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number as long as you want to print fibonacci series");
		
		
		
		/**Declare a variable of int type which store value taken from user.
		 *  We use nextInt() for taking an primitive integer type value. nextInt() is the method of Scanner class.*/
		
		int num = sc.nextInt();
		
		
		/**Here we call the fibonacciSeries function. this function is static so no need to object creation.
		 * This method needs an int type argument which is a number taken from user.*/
		fibonacciSeries(num);
		
		
		
		/**Close the Scanner class*/
		
		sc.close();
		
	}
	
	static void fibonacciSeries(int num)
	{
		/** Here, declaring a test case which checks that number is an appropriate or not.
		 * If number is less than 0 or equal to 1 it will return appropriate message to user. */
		if(num<=0)
		{
			System.out.println("Please enter an appropriate number which bigger than 1 or equal to 1");
			return;
		}
		
		
		
		/**Declaring two int type variable n1 and n2. n1 initialized with 0 and n2 initialized with 1
		 *  becuase fibonacci series first two term is static.*/
		
		int n1=0, n2=1;
		
		
		
		/** First two variable print the static value of fibonacci series which is 0 and 1 
		 * Here we print first number of the series which is 0.   */
		
		System.out.print(n1+",  ");
		
		
		/** In the while loop control will check that n2 is less than or equal to user input value.
		 *  loop will continue untill condition would be true. */
		
		while(n2<=num)
		{
			
			
			/** Here first it will print 1, then it will change by formula.*/
						
			System.out.print(n2+",  ");
			
			
			/** in this series both value added and stores in the n2 i.e. n2=n1+n2 .
			 * and n2 previous value store in the n1. here, by using formula,  we can get previous n2 value by substracting latest n2 value by n1
			 * and store this value in n1.*/
			
			n2=n1+n2;
			n1=n2-n1;
		}
	}

}
