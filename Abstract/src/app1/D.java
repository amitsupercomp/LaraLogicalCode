package app1;


abstract class T
{
	abstract void test1();
}


public class D extends T
{
	void test1()
	{
		System.out.println("D-test1");
	}
	public static void main(String[] args) {
		
		D d1 = new D();
		d1.test1();
	}
}

//overriding or replacing abstract methos/class with concrete class/method.
