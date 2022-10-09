package assignment3;

import java.util.Scanner;

public class A5 
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Input a String to check repeatedly character");
		String s=sc.nextLine();
		s=s.toLowerCase();
		for(int i=0; i<s.length(); i++)
		{
			if(s.charAt(i)==' ')
				continue;
			for(int j=i+1; j<s.length(); j++)
			{
				if(s.charAt(j)==' ')
					continue;
				if(s.charAt(i)==s.charAt(j))
				{
					System.out.print(s.charAt(i)+ "     ");
					break;
				}
			}
		}
		sc.close();

	}

}
