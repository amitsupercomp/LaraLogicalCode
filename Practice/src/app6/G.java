package app6;

public class G 
{
	static String[] args;
	
	 static int i=test();
	
      static 	int test()
	{
		System.out.println("Test");
		main(null);
		
		main(args);
		return 12;
	}
	
	static
	{
		main(null);
		
		main(args);
	}
	
	public static void main(String[] args) {
		
		System.out.println("Main");
	}

}
