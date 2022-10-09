package app2;

public class H
{
	
	H()
	{
		this(90);
		System.out.println("H()");
	}
	
	H(int i)
	{
		System.out.println("H(int)");
	}
	
	public static void main(String[] args) {
		H ref1 = new H();
		System.out.println("----------------");
		H ref2 = new H(23);
	}

}

//
