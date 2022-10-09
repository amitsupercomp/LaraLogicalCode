package app6;

public class M8 
{
	
	static A method()
	{
		return new A();
	}
	
	static A method2()
	{
		return new A()
				{
					void test1()
					{
						System.out.println("AIC2 - test1");
					}
				};
	}
	
	static A method3()
	{
		return new A()
				{
						void test2()
						{
							System.out.println("AIC-3 test2");
						}
				};
	}
	
	static A method4()
	{
		return new A()
				{
						void test2()
						{
							System.out.println("AIC-4 test2");
						}
						void test1()
						{
							System.out.println("AIC-4 test1");
						}
				};
	}
	
	public static void main(String[] args) {
		
		A a1=method2();
		a1.test1();
		a1.test2();
		System.out.println("--------------------");
		A a2=method3();
		a2.test1();
		a2.test2();
		System.out.println("------------------------");
		A a3=method4();
		a3.test1();
		a3.test2();
		System.out.println("-------------------");
		A a4=method();
		a4.test1();
		a4.test2();
		
	}

}
