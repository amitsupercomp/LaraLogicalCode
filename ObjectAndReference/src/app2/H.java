package app2;

public class H 
{
	
	int i;
	static H test()
	{
		H h1 = new H();
		h1.i = 10;
		return h1;
	}
	
	public static void main(String[] args) 
	{
		
		H obj = test();
		
		System.out.println("main : "+obj.i); 	//10
		
	}

}
