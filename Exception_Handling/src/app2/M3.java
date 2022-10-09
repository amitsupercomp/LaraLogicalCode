package app2;

public class M3 
{
	public static void main(String[] args)
	{
		int i=10/0;
		System.out.println(1);
		try
		{
			System.out.println(2);
			System.out.println(3);
		}
		catch(ArithmeticException e)		
		{
			System.out.println(4);
		}
		System.out.println(5);
		
	}

}
