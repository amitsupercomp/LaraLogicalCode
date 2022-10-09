package app1;

public class D 
{
	
	static int i;
	static int j=i;	//direct read
	static int k=D.i;	//indirect read
	static int m=test();
	
	static 
	{
		System.out.println(i);	//direct read
		System.out.println(D.i);	//indirect read
		i=10;		//direct write
		D.i=20;	//indirect write
		test();
	}
	
	static int test()
	{
		System.out.println(i);		//direct read
		System.out.println(D.i);	//indirect read
		i=30;			//direct write
		D.i=300;	//indirect write
		return i;	//indirect read
	}
	
	public static void main(String[] args) 
	{
		System.out.println("main: "+i+" , "+j+" , "+k+" , "+m);
	}
}
/*
 * Direct read is not allowed before JVM notified.....
 * 
 */