package app6;

public class M3 
{
	
	public static void main(String[] args) {
		
		C c2 = new C()
		{
				void test1()
				{
					System.out.println("From AIC-test1");
				}
		};
		
		c2.test1();
		c2.test2();
		System.out.println("---------------------");
		
		C c3 = new C()
		{
				void test1()
				{
					System.out.println("From AIC-test1-2");
				}
				
				void test2()
				{
					System.out.println("From AIC-test2-1");
				}
		};
		
		c3.test1();
		c3.test2();
	}

}
