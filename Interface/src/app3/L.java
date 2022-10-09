package app3;

interface I
{
	void test1();
}

interface J
{
	void test2();
}

class K
{
	void test3()
	{
		System.out.println("I-test3");
	}
}

public class L extends K implements I,J
{
	public void test1()
	{
		System.out.println("L-test1");
	}

	public void test2()
	{
		System.out.println("L-test2");
	}
	public static void main(String[] args) {
		
		L l = new L();
		l.test1();
		l.test2();
		l.test3();
		System.out.println("Done");
	}
}
