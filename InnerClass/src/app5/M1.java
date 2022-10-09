package app5;

public class M1
{
	
	int i;
	static int j;
	void test1()
	{
		
	}
	
	static void test2()
	{
		
	}
	
	public static void main(String[] args) 
	{
		M1 m = new M1();
		System.out.println(m.i);
		m.test1();
		
		System.out.println("Call static members");
		
		System.out.println(M1.j);
		M1.test2();
		
		System.out.println(j);
		test2();
		
		
	}

}
