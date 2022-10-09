package app1;

abstract class X
{
	
}

abstract class V
{
	protected abstract void test1();
}

abstract class U
{
	void test1()
	{
		
	}
	V v;
	
	abstract void test2();
}

abstract class W
{
	abstract void test1();
	abstract void test2();
}


public abstract class C 
{
	public abstract void abc();

	protected static void abcs()
	{
		System.out.println("Protected");
	}
}