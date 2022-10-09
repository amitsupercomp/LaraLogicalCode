package app8;
class C
{
	public static void main(String[] args) 
	{
		System.out.println("C-Main");		
	}
	
	static
	{
		System.out.println("C-SIB");
	}
}


public class D
{
	public static void main(String[] args) {
		System.out.println("Main Begin D");
		C.main(null);
		System.out.println("---------------");
		C.main(args);
		System.out.println("===========");
		
		
	}

}
