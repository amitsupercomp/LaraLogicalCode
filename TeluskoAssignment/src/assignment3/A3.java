package assignment3;

import java.util.Scanner;

public class A3
{
	
	static
	{
		System.out.println("This is the java program to check whether the string is anagram or not");
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first String");
		String s1=sc.next();
		s1=s1.toLowerCase();
		System.out.println("Enter another string to check anagram");
		String s2=sc.next();
		s2=s2.toLowerCase();
		int flag=0;
		if(s1.length()==s2.length() && !s1.equals(s2))
		{
			for(int i=0; i<s1.length(); i++)
			{
				flag=0;
				for(int j=0; j<s2.length(); j++)
				{
					if(s1.charAt(i)==s2.charAt(j))
					{
						flag=1;
						break;
					}
				}
				if(flag==0)
					break;
			}
			if(flag==0)
				System.out.println("String is not anagram");
			else
				System.out.println("String is anagram");
		}
		else
		{
			System.out.println("String is not anagram");
		}
		
		sc.close();

	}

}
