package Practice;

import java.util.Scanner;

/**	Program to check number is palindrome or not */
public class P 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to check whether it is Palindrome or not");
		int n1=sc.nextInt();
		int checkNum=0;
		int n=n1;
		while(n!=0)
		{
			checkNum=checkNum*10+(n%10);
			n=n/10;
		}
		if(checkNum==n1)
			System.out.println("Number "+n1+" is Palindrome");
		else
			System.out.println("Number "+n1+" is not Palindrome");
		sc.close();	
	}
}
