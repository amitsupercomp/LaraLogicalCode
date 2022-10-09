package app.practice;

abstract class B
{
	abstract void test1();
	abstract void test2();
	void test3()
	{
		System.out.println("From test3");
	}
}

abstract class C extends B
{
	void test1()
	{
		System.out.println("test1");
	}
}

public class A extends C 
{
	
	void test2()
	{
		System.out.println("test2");
	}
	
	public static void main(String[] args) {
		
		A a = new A();
		a.test1();
		a.test2();
		a.test3();
		
	}

}
