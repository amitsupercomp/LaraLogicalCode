package app2;

public class G 
{
	
	public static void main(String[] args)
	{
		
		System.out.println("Hello :" +args.length);
		
		if(args.length>0)
		{
			for(String arg : args)
				System.out.println(arg);
		}
		else
		{
			System.out.println("You have not enter any command line argument");
		}
		
	}

}
