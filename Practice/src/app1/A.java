package app1;

public class A 
{
	
	void test()
	{
		System.out.println("from test");
	}
	static
	{
		A a1 =new A();
		a1.test();
	}
	public static void main(String[] args) 
	{
		
		System.out.println("main");
		
	}

}
