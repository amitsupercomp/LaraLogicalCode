package app1;

public class N 
{
	static
	{
		test();
	}
	static void test()
	{
		System.out.println(a); 	// Direct read is allowed before JVM notified.
		//inside a method you can use any global variable.
	}
	static int a=10;
	static
	{
		test();
	}
	public static void main(String[] args) 
	{
		System.out.println(a);
	}

}
