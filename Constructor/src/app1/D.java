package app1;

public class D 
{
	int i;
	D(int arg)
	{
		System.out.println("D class Constructor");
		i=arg;
	}
	public static void main(String[] args)
	{
		
		D d1 = new D(10);
		System.out.println("------------");
		System.out.println(d1.i);
		D d2 = new D(10034);
		System.out.println("------------");
		System.out.println(d2.i);
		D d3 = new D(56644);
		System.out.println("------------");
		System.out.println(d3.i);
		D d4 = new D(34343);
		System.out.println("------------");
		System.out.println(d4.i);
		
		
	}

}
/*
 * Constructor can take any number of arguments.
 */