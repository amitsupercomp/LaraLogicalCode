package app2;

public class M5
{
	public static void main(String[] args)
	{
		System.out.println(1);
		try
		{
			System.out.println(2);
			int i=10/0;
			System.out.println(3);
		}
		catch(ArithmeticException e)		
		{
			System.out.println(4);
			try
			{
				System.out.println(41);
				int i=10/0;
				System.out.println(42);
			}
			catch(ArithmeticException ee)
			{
				System.out.println(43);
			}
			System.out.println(5);
		}
		System.out.println(6);
		
	}

}
