package app1;

class B
{
	void test()
	{
		System.out.println("test()");
	}
}

public class C extends B
{
	void test(int i)
	{
		System.out.println("test(int)");
	}
	public static void main(String[] args) {
		
		B b1 = new B();
		b1.test();
		C c= (C) b1;
		//b1.test(10);
		c.test(12);
		c.test();
	}

}
