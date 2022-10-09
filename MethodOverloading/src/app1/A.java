package app1;

abstract class B1
{
	abstract void test(int i);
	abstract void test(int i, int j);
	abstract void test(long l, long j);
}
class B2
{
	 void test()
	{
		System.out.println("test");
	}
	
	 void test(int i)
	{
		System.out.println("test(int)");
	}
}
public class A extends B2
{
	void test()
	{
		System.out.println("test()");
	}
	
	void test(int i)
	{
		System.out.println("test(int i)");
	}
	void test(int i, int j)
	{
		System.out.println("test(int , int)");
	}
	void test(long l, long k)
	{
		System.out.println("test(long, long)");
	}
	
	void test(double i)
	{
		System.out.println("test(double i)");
	}
	public static void main(String[] args) 
	{
		A a1 = new A();
		a1.test();
		a1.test(10);
		a1.test(34.56);
		a1.test(12, 120);
		a1.test(123l, 12340);
		System.out.println("Done");
		
	}

}
