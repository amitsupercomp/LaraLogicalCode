package app8;

import java.util.Scanner;

public class A
{
	
	public static void main(String[] args)
	{
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a natural number");
		int n=sc.nextInt();
		int sum=0;
		for(int i=1; i<=n; sum+=i, i++);
		System.out.println("Sum is  ::   "+sum);
		sc.close();
	}

}
