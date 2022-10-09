package app2;

public class M5 
{
	public static void main(String[] args) {
		
		B b1 = new D();
		
		test1(b1);		//test1((A) b1);
	}
	
	static void test1(A a1)
	{
		System.out.println("done");
	}
	
}

