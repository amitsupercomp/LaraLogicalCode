package app1;

public class E 
{
	int i;
	
	void test1()
	{
		System.out.println("from test1: "+i);		//from test1: 0
		i+=1;
		test2();		//same object passing in test2()
	}
	void test2()
	{
		System.out.println("from test2: "+i);		//from test2: 1
		i+=2;
		test3();
	}
	void test3()
	{
		System.out.println("from test3: "+i);		//from test3: 3
		i+=3;
		test4();
	}
	void test4()
	{
		System.out.println("from test4: "+i);		//from test4: 6
		i+=4;
	}
	
	public static void main(String[] args)
	{
		
		E e1=new E();
		System.out.println("main1 : "+e1.i);		//main1 : 0
		e1.test1();
		System.out.println("main2 : "+e1.i);		//main2 : 10
	}

}

/*
 */
