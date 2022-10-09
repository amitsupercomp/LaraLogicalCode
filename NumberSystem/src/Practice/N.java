package Practice;

import java.util.Scanner;

public class N 
{
	/**	Program to print numbers in Descending order		*/
	public static void main(String[] args) {

		Scanner sc =new Scanner(System.in);
		System.out.println("Enter three numbers");
		int i = sc.nextInt();
		int j = sc.nextInt();
		int k = sc.nextInt();

		if(i>j && i>k)
			if(j>k)
			{
				System.out.println(i);
				System.out.println(j);
				System.out.println(k);
			}
			else
			{
				System.out.println(i);
				System.out.println(k);
				System.out.println(j);
			}
		else if(j>i && j>k)
			if(i>k)
			{
				System.out.println(j);
				System.out.println(i);
				System.out.println(k);
			}
			else
			{
				System.out.println(j);
				System.out.println(k);
				System.out.println(i);
			}
		else
		{
			if(j>i)
			{
				System.out.println(k);
				System.out.println(j);
				System.out.println(i);
			}
			else
			{
				System.out.println(k);
				System.out.println(i);
				System.out.println(j);
			}
		}

	}

}
