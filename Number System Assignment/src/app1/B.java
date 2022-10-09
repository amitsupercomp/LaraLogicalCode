package app1;

import java.util.Scanner;

public class B 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter three number to find smaller among them");
		int m=sc.nextInt(), n=sc.nextInt(), o=sc.nextInt();
		System.out.println("Smaller number among them  ::  "+(m<n && m<o?m:n<o?n:o));
		sc.close();
	}

}
