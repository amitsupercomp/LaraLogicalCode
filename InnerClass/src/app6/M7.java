package app6;

public class M7 
{
	
	static void method1(D d1)
	{
		d1.test1();
		d1.test2();
	}
	static D method()
	{
		return new D()
				{
						public void test1()
						{
							System.out.println("AIC-test1");
						}
						public void test2()
						{
							System.out.println("AIC-test2");
						}
				};
	}
	
	public static void main(String[] args) {
		
		method1(new D(){
			
			public void test1()
			{
				System.out.println("AIC-test1");
			}
			public void test2()
			{
				System.out.println("AIC-test2");
			}
		});
		
		D d1=method();
		d1.test1();
		d1.test2();
		
	}

}
