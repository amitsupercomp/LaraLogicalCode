package app2;

public class I 
{
	
	I()
	{
		System.out.println("I()");
	}
	
	I(int i)
	{
		this();
		System.out.println("I(int)");
	}
	public static void main(String[] args) {
		I i1= new I();
		System.out.println("-----------------");
		
		I i2= new I(19);
		System.out.println("----------------");
		
	}

}
