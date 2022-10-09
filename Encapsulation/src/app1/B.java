package app1;
class A
{
	int i;
	void test()
	{
		System.out.println("A.test()");
	}
}
public class B extends A
{
	int j;
	void f1()
	{
		System.out.println("B.f1");
	}
	
	public static void main(String[] args) {
		B b1 = new B();
		System.out.println(b1.i);
		System.out.println(b1.j);
		b1.test();
		b1.f1();
		System.out.println("done");
	}

}

/*
 * Extends keyword always pointing to super class.
 * 
 */
