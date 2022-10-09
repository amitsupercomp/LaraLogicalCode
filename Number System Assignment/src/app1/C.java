package app1;

import java.util.Scanner;

public class C 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter three number to find middle among them");
		int m=sc.nextInt(), n=sc.nextInt(), o=sc.nextInt();				
		System.out.println("Middle number among them is ::  "+(m>n && m<o?m:n<o?n:o>m && o<n?o:n>m && ));
		sc.close();
		
	}

}
