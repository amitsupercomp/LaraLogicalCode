package app8;

class J
{
	static
	{
		System.out.println("J-SIB");
	}
	static
	{
		System.out.println("J-SIB-2");
	}
	
}
class I extends J
{
	static
	{
		System.out.println("I-SIB");
	}
	
	static
	{
		System.out.println("I-SIB_2");
	}
	static int i=1100;
}

public class H extends I
{
	public static void main(String[] args)
	{
		System.out.println("main");
		
	}
	static
	{
		System.out.println("H-SIB");
	}

}
