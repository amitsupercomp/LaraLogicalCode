package app1;

public class B
{
	
	int x;
	static void test()
	{
			B b1 =new B();
			b1.x=100;
			B b2 = new B();
			b2=b1;
			System.out.println(b2.x);
	}
	
	public static void main(String[] args) {
		
		System.out.println("main");
		test();
	}

}
