package app3;

public class M4 
{
	int test1()
	{
		
		try
		{
			//someStatement
		}
		catch(ArithmeticException ex)
		{
			//someStatement
		}
		catch(NullPointerException es)
		{
			//someStatement
		}
		finally
		{
			//someStatement
		}
		return 122;
	}
	
	int test2()
	{
		
		try
		{
			//someStatement
			return 122;
		}
		catch(ArithmeticException ex)
		{
			//someStatement
			return 122;
		}
		catch(NullPointerException es)
		{
			//someStatement
			return 122;
		}
		finally
		{
			//someStatement
		}
		
	}
	
	int test3()
	{
		
		try
		{
			//someStatement
		}
		catch(ArithmeticException ex)
		{
			//someStatement
		}
		catch(NullPointerException es)
		{
			//someStatement
		}
		finally
		{
			//someStatement
			return 344;
		}
		
	}
	
//	int test4()
//	{
//		
//		try
//		{
//			//someStatement
//		}
//		catch(ArithmeticException ex)
//		{
//			//someStatement
//		}
//		catch(NullPointerException es)
//		{
//			//someStatement
//		}
//		finally
//		{
//			//someStatement
//			return 344;
//		}
//		return 234;
//		
//	}
	

}
