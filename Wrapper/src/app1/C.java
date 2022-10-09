package app1;

public class C
{
	public static void main(String[] args) 
	{
		test("abc",true);
		test("abc", true, 20);
		test("abc",true, 20,30);
		test("abc", true, 30,40,40);
		
	}
	
	static void test(String s, boolean b, int ...cs)
	{
		System.out.println("done");
	}
	
//	static void test1(String...str, byte b)
//	{
//		
//	}
	
	static void test1(String[]str)
	{
		
	}
	
	static void test1(String...as)
	{
		
	}
	
	

}
