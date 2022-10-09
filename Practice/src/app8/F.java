package app8;

class E
{
	public static void main(String[] args) {
		
		System.out.println("Main - E");
	}
	static
	{
		System.out.println("E-SIB");
	}
}

public class F 
{
	public static void main(String[] args) 
	{
		System.out.println("F-Main Start");
		E.main(args);
		System.out.println("=-----------------");
		E.main(xyz);
		System.out.println("------------------");
		
	}
	static String []xyz;
	static
	{
		
	}

}
