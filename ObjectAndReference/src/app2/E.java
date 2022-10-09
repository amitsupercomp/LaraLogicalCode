package app2;

public class E 
{
	int i;
	//E e = new E();		It will give StackOverFlow exception.

	static void test()
	{
		E e1 = new E();		//e1 has scope only to the test().
		System.out.println(e1.i);
		e1.i=200;
		System.out.println(e1.i);
		System.out.println();
	}
//	public void test1()
//	{
//		System.out.println(e.i);
//	}
	public static void main(String[] args) 
	{
		test();
		
		E e1 = new E();
		System.out.println(e1.i);
		System.out.println();
		//e1.test1();
	}
	
//	E e = new E();	It will give an exception

}

/*
 * Objects can be created in any method not only in the main().
 */
