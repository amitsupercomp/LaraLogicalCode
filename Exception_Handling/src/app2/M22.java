package app2;

public class M22 
{
	public static void main(String[] args)
	{
		
		System.out.println("main begin");
//		if(true)
//		{
//			return;
//		}
		try
		{
			System.out.println(1);
			int i = 10 / 0;
			System.out.println(2);
		}
		
		catch(ArithmeticException ex)
		{
			System.out.println(3);
		}
		finally
		{
			System.out.println(4);
		}
		System.out.println("main end");
		
	}


}
