package app2;

public class E 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		System.out.println("main begin");
		try
		{
			System.out.println(args[0]+", "+args[1]+" "+args[2]);
		}
		catch(Exception e)
		{
			System.out.println("Ignore "+e+" exception");
		}
		System.out.println("main end");
		

	}
	
	static
	{
		System.out.println("from static begin");
		String [] a= {"Hello ","I am main","from static"};
		main(a);
		System.out.println("from static close");
		
	}

}
