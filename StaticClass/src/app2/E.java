package app2;

class X
{
	static
	{
		System.out.println("X-sib ");
	}
	static int i = 100;
	static
	{
		System.out.println("X-SIB");
	}
	static
	{
		System.out.println("X-SIB 3");
	}
}


public class E 
{
	static 
	{
		System.out.println("E-SIB");
	}
	public static void main(String[] args) 
	{
		
		System.out.println("main begin");
		System.out.println(X.i);
		System.out.println("main end");
		
	}

}


/*
First of all only E class loading to memory.  While E loading to memory Static initializer executes first then java command call to main() of E..
after main begin X.i X class load to memory then first executes Static intializer only once and then print value of i.
*/

