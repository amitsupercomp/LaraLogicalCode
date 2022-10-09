package app3;

public class H 
{
	
	H()
	{
		System.out.println("H()");
	}
	
	H(int i)
	{
		this();
		System.out.println("U(int)");
	}
	
	{
		System.out.println("H-IIB");
	}
	public static void main(String[] args) {
		H h1 = new H();
		System.out.println("---------------------");
		H h2 = new H(90);
	}

}
/*
IIB execution only one time for object creation, even though multiple times constructor will call.
*/