package app5;

public class M6 
{
	
	public static void main(String[] args) 
	{
		int i=10;
		final int j = 20;
		class A
		{
			void test()
			{
				System.out.println(i);
				System.out.println(j);
			}
		}
		A a = new A();
		a.test();			//Total class depend upon outside of the class, which is not allowing in the Java
		a.test();
//		i=122;		//i can not be change anywhere becuase it will give compilation error. 
	}

}
