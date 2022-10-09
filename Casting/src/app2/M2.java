package app2;

public class M2 
{
	
	public static void main(String[] args) {
		
		A a1 = new A();
		B b1 = null;
		test1(a1);
		test1(new A());
		test2(b1);
		test2(new B());
	}
	
	static void test1(A arg)
	{
		System.out.println("Test1");
	}
	
	static void test2(B arg)
	{
		System.out.println("test2");
	}

}
