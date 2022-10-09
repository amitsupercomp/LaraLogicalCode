package app1;

public class A 
{
	
	int i;
	
	void test()
	{
		System.out.println("from test: "+this);			//'This' is availble only non-static availble block. Test is a non-static block. In every non-static block 'this' is availble.
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		A a1=new A();
		System.out.println("main1: "+a1);
		A a2=new A();
		System.out.println("main2: "+a2);
		A a3=new A();
		System.out.println("main3: "+a3);
		a1.test();
		System.out.println("-------------------");
		a2.test();
		System.out.println("-------------------");
		a3.test();
		System.out.println("-------------------");		

	}

}


/*
 * 	'This' is a keyword. it's a reference variable. It refers to the current class object. 
 * 
 */
