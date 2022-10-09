package app1;

public class C 
{
	
	static int i=test1();	
	static
	{
		System.out.println("SIB1");
	}
	
	static int test1()
	{
		System.out.println("test1");
		return 10;
	}
	
	static
	{
		System.out.println("SIB2");
	}
	
	static int j=test2();
	static int test2()
	{
		System.out.println("test2");
		return 30;
	}
	
	static
	{
		System.out.println("SIB3");
	}
	public static void main(String[] args) {
		System.out.println("main: "+i+" , "+j);
	}

}

/*
 test1
 SIB1
 SIB2
 test2
 SIB3
 main
 */
