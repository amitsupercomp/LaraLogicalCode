package app2;

public class M2 
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
		catch(NullPointerException e)		//if catch is not compatable to the rised exception/error object, then flow will terminate.
		{
			System.out.println(4);
		}
		System.out.println(5);
		
	}

}
