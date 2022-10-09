package app6;

public class M5 
{
	static void method1(A a1)
	{
		a1.test1();
		a1.test2();
	}
	
	public static void main(String[] args) {
		
		A a1 = new A();
		method1(a1);
		System.out.println("------------");
		method1(new A());
		System.out.println("-------------------");
		method1(new A()
				{
					void test1()
					{
						System.out.println("AIC - test1");
					}
				});
		System.out.println("------------------");
		
		method1(new A()
		{
			void test2()
			{
				System.out.println("AIC - test1");
			}
		});
System.out.println("------------------");

	method1(new A()
	{
		void test2()
		{
			System.out.println("AIC - test1");
		}
		void test1()
		{
			System.out.println("AIC - test1");
		}
	});
System.out.println("------------------");
	}

}
