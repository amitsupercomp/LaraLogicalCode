package app2;
class Y
{
	static int i=1;
	static void test()
	{
		System.out.println("from Y.test");
	}
}

public class D
{
	
	static int i =2;
	static void test()
	{
		System.out.println("from D.test");
	}
	public static void main(String[] args) 
	{
		
		System.out.println(i);
		test();
		System.out.println(D.i);
		D.test();
		
		System.out.println(Y.i);
		Y.test();
		Y.i=24;
		System.out.println(Y.i);
		D.i=34;
		System.out.println(i);
		
	}

}

/*
 
 */






