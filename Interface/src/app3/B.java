package app3;

interface A
{
	void test1();
	int test2();
	double test3(int i, int j);
	long test4(int i, int j);
}

public class B implements A
{
	public void test1()
	{
		System.out.println("B-tset1");
	}
	
	public int test2()
	{
		System.out.println("B-test2");
		return 100;
	}
	
	public double test3(int a, int b)
	{
		System.out.println("B-test3");
		return 100.500;
	}
	
	public long test4(int i, int j)
	{
		System.out.println("B-test4");
		return i+j;
	}
	
	public static void main(String[] args) {
		
		B b1 = new B();
		b1.test1();
		b1.test2();
		System.out.println(b1.test3(12,34));;
		System.out.println(b1.test4(1267, 8758));;
		System.out.println("Done");
		
	}
}
