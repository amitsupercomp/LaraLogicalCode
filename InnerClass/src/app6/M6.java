package app6;

public class M6 
{
	static void method1(C c1)
	{
		c1.test1();
		c1.test2();
	}
	
	public static void main(String[] args) {
		
	//	method1(new C());
		method1(new C(){
			void test1()
			{
				System.out.println("AIC - test1");
			}
		});
		System.out.println("------------");
		
		method1(new C(){
			void test1()
			{
				System.out.println("AIC - test1");
			}
			void test2()
			{
				System.out.println("AIC - test2");
			}
		});
	}

}
