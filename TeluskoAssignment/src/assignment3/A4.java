package assignment3;

import java.util.Scanner;

public class A4
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);		
		System.out.println("Enter a string to check pangram");
		String s=sc.nextLine();
		s=s.toUpperCase();
		int flag=0;
		for(char c=65; c<=90; c++)
		{
			flag=0;
			for(int j=0 ; j<s.length(); j++)
			{
				if(s.charAt(j)==' ')
				{
					continue;
				}
				else
				{
					if(c==s.charAt(j))
					{
						flag=1;
						break;
					}
				}
				
			}
			if(flag==0)
				break;
		}
		if(flag==1)
			System.out.println("String is pangram");
		else
			System.out.println("String is not pangram");

		sc.close();
	}

}
