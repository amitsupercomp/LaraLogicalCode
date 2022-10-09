package app1;

public class StaticTest8 
{
	static int i;
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		System.out.println("main : "+i);
		test();
		StaticTest8.test();
		

	}
	
	public static void test()
	{
		System.out.println("test : " +i);
	}

}
