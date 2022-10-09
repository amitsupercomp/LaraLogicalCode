package app1;

class B
{
	int i;
	static int j;
	void test1()
	{
		System.out.println("From test1()");
	}
	static void test2()
	{
		System.out.println("From test()");
	}
}

public class A extends B
{
	int m;
	static int n;
	void f1()
	{
		System.out.println("From f1()");
	}
	
	static void f2()
	{
		System.out.println("From f2()");
	}
	
	public static void main(String[] args) {
		System.out.println("value of j : "+A.j);
		System.out.println(A.n);
		A.test2();
		A.f2();
		A a = new A();
		System.err.println(a.i);
		System.err.println(a.m);
		a.test1();
		a.f1();
		System.out.println("done");
	}

}
