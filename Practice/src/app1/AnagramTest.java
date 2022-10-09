package app1;

import java.util.Scanner;

public class AnagramTest {
	
	static 
	{
		System.out.println("In this program we have to check that how many words in the string are anagram");
	}
	
	public static void main(String[] args) 
	{
		System.out.println("Enter a Sentence/String to check anagram words in the sentence");
		Scanner sc = new Scanner(System.in);
		String str=sc.nextLine();
			str=str.toLowerCase();
			String[] str1=str.split(" ");
			int flag=0;
			String[] res= {};
			int inc=0;
		for(int i=0; i<str1.length; i++)
		{
			for(int j=i+1; j<str1.length; j++)
			{
				flag=0;
				if(str1[i].length()==str1[j].length() && !str1[i].equals(str1[j]))
				{
					for(int ii=0; ii<str1[i].length(); ii++)
					{
						flag=0;
						for(int jj=0; jj<str1[j].length(); jj++)
						{
							if(str1[i].charAt(ii)==str1[j].charAt(jj))
							{
								flag=1;
								break;
							}
						}
						if(flag==0)
							break;
					}
				}
				if(flag==1)
				res[inc++]=str1[j];
			}
			
			//printing the result
			
			for(int i=0;i<res.length; i++)
			{
				for(int j=i+1; j<res.length; j++)
			}
		}
		
	}

}
