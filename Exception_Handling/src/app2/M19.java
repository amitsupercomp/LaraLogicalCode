package app2;

public class M19
{
	public static void main(String[] args)
	{
		
		System.out.println("main begin");
		int i = 10 / 0;
		try
		{
			System.out.println(1);
			
			System.out.println(2);
		}
		
		catch(ArithmeticException ex)
		{
			System.out.println(3);
			System.out.println(4);
		}
		finally
		{
			System.out.println(5);
		}
		System.out.println("main end");
		
	}

}
