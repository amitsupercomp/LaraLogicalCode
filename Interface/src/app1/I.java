package app1;

public abstract interface I 
{
	int a=0;
	static int b=100;
	final int c=500;
	static final int d=900;
	final static public int e =1000;
	static final public int f = 89;
	
	 void test1();
	abstract void test2();
	
	public void test3();
	abstract void test4();
	public void test5();
	public abstract void test6();
	abstract public void test7();
	

}

//All are public static final even programmer make it only int or final , compiler make it public static final by default.

//Every method in interface will be public and abstract.

//Member of the interface is public by default but not the interface is itself public by default.