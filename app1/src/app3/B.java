package app3;

public class B
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		A a1 = new A()
				{
					public void test()
					{
						System.out.println("Updated");
					}
					
					public void test1()
					{
						System.out.println("updated 2");
					}
				};
				
				a1.test();
				a1.test1();
				
				//Overriden by using inner class.

	}

}
