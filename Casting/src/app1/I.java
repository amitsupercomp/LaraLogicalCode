package app1;

public class I 
{
	
	static float test1(short s)
	{
		return test2(s);
	}
	
	static long test2(int s)
	{
		return s;
	}
	
	public static void main(String[] args)
	{
		byte b=100;
		
		double d = test1(b);
		
		System.out.println(d);
		
		System.out.println("Done");
			
		
	}

}
