package app6;

public class M4 
{
	
	public static void main(String[] args) 
	{
		D d1 = new D()			//extends Object and implements D
				{
					public void test1()
					{
						System.out.println("AIC - test1");
					}
					
					public void test2()
					{
						System.out.println("AIC - test2");
					}
				};
				
				d1.test1();
				d1.test2();		
	}

}

//Every methods of the interface should implements in the anonymous inner class.
