package app1;

import java.util.Scanner;

public class D 
{
	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter three number to print ascending order");
		int m=sc.nextInt(), n=sc.nextInt(), o=sc.nextInt();
		System.out.println("Number in ascending oreder  ::   "+(m<n && m<o?m:o<n?o:n)+" , "+);
		sc.close();
		
	}

}
