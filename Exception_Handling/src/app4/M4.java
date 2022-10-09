package app4;

public class M4 
{
	public static void main(String[] args) {
		System.out.println(1);
		test1();
		System.out.println(2);
		
	}
	static void test1()
	{
		System.out.println(3);
		try
		{
			test2();
		}
		catch(ArithmeticException es)
		{
			//es.printStackTrace();		//It is recommended to printStackTrace use in catch to print exception
 			//System.out.println(es);
			System.out.println(es.getMessage());
		}
		System.out.println(4);
	}
	static void test2()
	{
		System.out.println(5);
		int i = 1023 / 0;
		System.out.println(6);
	}

}
