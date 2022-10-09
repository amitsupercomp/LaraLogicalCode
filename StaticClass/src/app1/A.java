package app1;

public class A 
{
	static		// static initializer block. It is a perfect initializer. All initializer executes before main method. Static initialization block---
	{
		System.out.println("SIB Before");
	}
	static int i=test();
	
	static
	{
		System.out.println("SIB");
	}
	static
	{
		System.out.println("SIB2");
	}
	
	static int test()
	{
		System.out.println("From test");
		return 100;
	}
	public static void main(String[] args) 
	{
		System.out.println("main: "+i);
		
	}

}


/*			
*/