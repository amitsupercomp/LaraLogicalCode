package app6;

public class C {
	
//	static int i=main(null);
//	static int j=main(null);
//	static int k=main(null);
	
	static int count=1;
	static int test()
	{
		main(null);
		main(null);
		return 100;
	}
	static
	{
		System.out.println("SIB");
		main(null);
		main(null);
		System.out.println("SIB END");
	}
	static int i=test();
	public static void main(String[] args)
	{
		System.out.println("Main : "+count++);
		
	}

}
