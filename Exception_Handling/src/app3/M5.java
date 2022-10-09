package app3;

public class M5
{
	public static void main(String[] args) {
		
		int i = test1();
		System.out.println(i);
		int j = test2();
		System.out.println(j);
	}
	
	static int test1()
	{
		try
		{
			return 122;
		}
		catch(ArithmeticException we)
		{
			
		}
		finally
		{
			return 233;
		}
	}
	static int test2()
	{
		try
		{
			int i = 10 / 0;
		}
		catch(ArithmeticException we)
		{
			return 123;
		}
		finally
		{
			return 233;
		}
	}
	

}
