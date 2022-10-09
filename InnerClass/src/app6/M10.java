package app6;

public class M10 
{
	
	public static void main(String[] args) {
		
		D d1 = method1();
		d1.test1();
		d1.test2();
		
	}
	
	static D method1()
	{
		return new D()
				{
					public void test1()
					{
						System.out.println("AIC -- test1");
					}
					
					public void test2()
					{
						System.out.println("AIC -- test2");
					}
				};
	}

}
