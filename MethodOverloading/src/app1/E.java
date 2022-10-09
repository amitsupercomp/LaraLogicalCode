package app1;

abstract class D
{
	 void test1()
	{
		System.out.println("test1-D");
	}
	 
	 abstract void test2();
	 
	protected void test3()
	 {
		 System.out.println("test()");
	 }
}
public class E extends D
{
	void test1()
	{
		System.out.println("test1-E");
	}
	
	void test2()
	{
		System.out.println("abstract");
	}
	
	protected void test3()
	{
		System.out.println("test3- E");
	}
	
	public static void main(String[] args) {
		
	}

}
