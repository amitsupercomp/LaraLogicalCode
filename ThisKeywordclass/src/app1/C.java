package app1;

public class C 
{
	
int i;
	
	void test()
	{
		System.out.println("from test: "+i);		//	compiler treated as this.i. while accessing one non static member in another non static member, compiler will add default reference variable i.e. 'this'.
		i+=10;
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		C c1=new C();
		c1.i=1;
		System.out.println("main1: "+c1.i);	//1
		C c2=new C();
		c2.i=2;
		System.out.println("main2: "+c2.i);		//2
		C c3=new C();
		c3.i=3;
		System.out.println("main3: "+c3.i);		//3
		c1.test();						//from test : 1    
		System.out.println("-------------------");
		c2.test();						//from test: 2
		System.out.println("-------------------");
		c3.test();						//from test: 3
		System.out.println("-------------------");
		System.out.println(c1.i+" , "+c2.i+" , "+c3.i);		//11 , 12, 13

	}

}

/*
 * Practice 5 times this program. 
 * 
 * 
 */
