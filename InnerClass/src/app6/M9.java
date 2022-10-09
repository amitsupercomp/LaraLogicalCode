package app6;

public class M9 
{
	static C method1()
	{
		return new C()
				{
					void test1()
					{
						System.out.println("AIC1-test1");
					}
				};
	}
	
	static C method2()
	{
		return new C()
				{
					void test1()
					{
						System.out.println("AIC2-test1");
					}
					void test2()
					{
						System.out.println("AIC2-test2");
					}
				};
	}
	
	public static void main(String[] args) {
		
		C c1 = method1();
		
		c1.test1();
		c1.test2();
		
		System.out.println("-------------------------");
		
		C c2= method2();
		c2.test1();
		c2.test2();
		
	}

}
