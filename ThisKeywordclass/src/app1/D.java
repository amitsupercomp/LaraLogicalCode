package app1;

public class D 
{
	
	void test1()
	{
		System.out.println("from test1: "+this);
		test2();
	}
	void test2()
	{
		System.out.println("from test2: "+this);
		test3();
	}
	void test3()
	{
		System.out.println("from test3: "+this);
		test4();
	}
	void test4()
	{
		System.out.println("from test4: "+this);
	}
	
	public static void main(String[] args)
	{
		
		D d1=new D();
		System.out.println("main : "+d1);
		d1.test1();
//		D d2=new D();
//		System.out.println("main : "+d2);
//		d2.test2();
//		D d3=new D();
//		System.out.println("main : "+d3);
//		d3.test3();
//		D d4=new D();
//		System.out.println("main : "+d4);
//		d4.test4();
		
	}
	

}
