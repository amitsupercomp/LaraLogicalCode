package app6;

public class B {

	static int i;
	
	static void test1()
	{
		System.out.println("test1 : "+i);
		i=25;
	}
	
	static void test2()
	{
		System.out.println("test2 : "+i);
		i=35;
	}
	public static void main(String[] args) {
		
		System.out.println("main1 :"+i);
		i=15;
		System.out.println("main1 :"+i);
		test1();
		System.out.println("main1 :"+i);
		i=60;
		System.out.println("main1 :"+i);
		test2();
		System.out.println("main1 :"+i);
		
	}
}
