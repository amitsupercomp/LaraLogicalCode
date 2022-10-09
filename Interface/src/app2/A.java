package app2;

class B
{
	int i=25;
	static int m=55;
	void test1()
	{
		System.out.println("From B ");
	}
	
	static void method2()
	{
		System.out.println("from B static");
	}
}
public class A extends B
{
	int j=500;
	static int n=1500;
	void test2()
	{
		System.out.println("From test2");
	}
	
	static void method1()
	{
		System.out.println("from static method1");
	}
	
	public static void main(String[] args) {
		
		A e1 = new A();
		e1.test1();
		e1.test2();
		System.out.println(e1.i+", "+e1.j);
		A.method1();
		A.method2();
		System.out.println(A.m+ " , "+A.n);
	}
}
