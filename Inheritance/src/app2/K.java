package app2;

class I
{
	I()
	{
		System.out.println("I()");
	}
	I(int k)
	{
		System.out.println("I(int)");
	}
	I(String s1, int x)
	{
		this(10);
		System.out.println("I(String, int)");
	}
}


class J extends I
{
	J()
	{
		System.out.println("J()");
	}
	J(int k)
	{
		super("abc", 10);
		System.out.println("J(int)");
	}
	J(String s1, int x)
	{
		this(10);
		System.out.println("J(String, int)");
	}
}

public class K extends J
{
	
	K()
	{
		super(10);
		System.out.println("K()");
	}
	K(int k)
	{
		this();
		System.out.println("K(int)");
	}
	K(String s1, boolean b)
	{
		this(10);
		System.out.println("K(String, boolean)");
	}
	public static void main(String[] args) {
		K k1 = new K();
		System.out.println("--------------");
		K k2 = new K(99);
		System.out.println("-------------");
		K k3 = new K("abc",true);
		System.out.println("----------------");
		J j1 = new J();
		System.out.println("------------------");
		J j2 = new J(90);
		System.out.println("-------------------");
		J j3 = new J("test", 4000);
		
	}

}
