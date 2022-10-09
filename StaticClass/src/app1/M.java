package app1;

public class M 
{
	
	static
	{
		System.out.println(M.a); 	// Indirect read is  allowed before JVM notified.
	}
	static int a=10;
	
	public static void main(String[] args) 
	{
		System.out.println(a);
	}

}
