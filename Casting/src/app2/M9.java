package app2;

public class M9 
{
	public static void main(String[] args) {
		
		D d1 = (D)test();			//whenever right side is a superclass then downcasting is required
		System.out.println("Done");
	}
	
	static B test()
	{
		B b1= new D();
		return b1;
	}

}
