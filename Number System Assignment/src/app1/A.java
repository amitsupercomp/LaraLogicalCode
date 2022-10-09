package app1;

import java.util.Scanner;

public class A 
{
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two number for comparing who is bigger");
		int n=sc.nextInt(), m=sc.nextInt();
		System.out.println("Greater number is  ::  "+(n>m?n:m));
		sc.close();
		
	}

}
