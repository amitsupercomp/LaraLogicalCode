package app1;

public class B 
{
int i;
	
	void test()
	{
		System.out.println("from test: "+this.i);
		this.i+=10;
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		B b1=new B();
		b1.i=1;
		System.out.println("main1: "+b1.i);	//1
		B b2=new B();
		b2.i=2;
		System.out.println("main2: "+b2.i);		//2
		B b3=new B();
		b3.i=3;
		System.out.println("main3: "+b3.i);		//3
		b1.test();						//from test : 1    
		System.out.println("-------------------");
		b2.test();						//from test: 2
		System.out.println("-------------------");
		b3.test();						//from test: 3
		System.out.println("-------------------");
		System.out.println(b1.i+" , "+b2.i+" , "+b3.i);		//11 , 12, 13

	}

}

/*
 * 
 * 
 * 
 * 
 * 
 * 
 */
