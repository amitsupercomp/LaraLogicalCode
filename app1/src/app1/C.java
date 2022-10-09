package app1;

public class C
{
	
	public static void main(String[] args)
	{
		System.out.println("Mian Begin");
		
		test(true);
		
		System.out.println("Main Begin");
		
	}
	
	public static void test( int i)
	{
		System.out.println("test begin");
		//test();			It will give StackOverFlow Exception
		System.out.println("test end");
	}

}
