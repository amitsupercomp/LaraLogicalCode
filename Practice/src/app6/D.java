package app6;

class Z 
{
	public static void main(String[] args) {
		
		System.out.println("Z-Main");
		D.main(null);
		D.main(args);
	}
	static
	{
		System.out.println("Z-SIB");
	}
}

class D
{
	static int i=test();
	static int test()
	{
		System.out.println("from test");
		return 10;
	}
	public static void main(String[] args) {
		
		System.out.println("D-Main");
	}
	static
	{
		System.out.println("D-SIB");
	}

}
