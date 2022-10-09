package assignment3;

public class A2 
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		String s="Think Twice", res="";
		String []str=s.split(" ");
		
		
		for(int i=0; i<str.length; i++)
		{
			for(int l=str[i].length()-1; l>=0; l--)
			{
				if(str[i].charAt(l)>=65 && str[i].charAt(l)<=90)
				{
					res = res+(char)(str[i].charAt(l)+32);
				}
				else
				{
					res=res+str[i].charAt(l);
				}
			}
			res = res+" ";
		}
		
		System.out.println("Original String is : "+s);
		System.out.println("Reverse String is : "+res);

	}

}
