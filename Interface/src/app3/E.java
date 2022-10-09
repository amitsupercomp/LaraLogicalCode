package app3;

interface C
{
	void test1();
	void test2();
	void test3();
}
abstract class D implements C
{
	public void test1()
	{
		System.out.println("D-test1");
	}
	
	public void test2()
	{
		System.out.println(" D-test2");
	}
	//D class contain one abstract method that's why it is declare as abstract.
}

public class E extends D
{
	public void test3()
	{
		System.out.println("E-test3");
	}
	public static void main(String[] args) {
		E e = new E();
		e.test1();
		e.test2();
		e.test3();
		
	}
}
