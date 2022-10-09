package app2;

class M
{
	static int i=100;
	static
	{
		System.out.println("M-SIB");
	}
	static void test()
	{
		System.out.println("Test - M");
	}
}

class N
{
	static int i=200;
	static
	{
		System.out.println("N-SIB");
	}
	
	static void test()
	{
		System.out.println("Test - N");
	}
}

public class G
{
	static int i=300;
	static void test()
	{
		System.out.println("Test- G");
	}
	static
	{
		System.out.println("G-SIB 1");
	}
	static
	{
		System.out.println("G-SIB 2");
	}
	
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		System.out.println(i);
		System.out.println(M.i);
		System.out.println(N.i);
		M.test();
		N.test();
		System.out.println(M.i);
		System.out.println(N.i);
		M.test();
		N.test();
		
	}
	
	static
	{
		System.out.println("G- SIB 3");
	}

}
