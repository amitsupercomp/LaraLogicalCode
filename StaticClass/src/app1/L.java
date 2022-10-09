package app1;

public class L 
{
	
	static
	{
		System.out.println(a); 	// Direct read is not allowed before JVM notified.
	}
	static int a=10;
	
	public static void main(String[] args) 
	{
		System.out.println(a);
	}

}
