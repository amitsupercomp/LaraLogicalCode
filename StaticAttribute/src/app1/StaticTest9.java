package app1;

public class StaticTest9 
{
	static int i;

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		System.out.println("main : "+i);
		i=1;
		test();
		System.out.println("main : "+i);
		i=2;
		StaticTest9.test();
		System.out.println("main : "+i);
		
		

	}
	
	public static void test()
	{
		System.out.println("test : "+i);
		i+=3;
	}

}
