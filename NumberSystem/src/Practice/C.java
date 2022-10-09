package Practice;

public class C 
{
	public static void main(String[] args) {
		
		if(args.length==0)
		{
			System.out.println("Enter one integer as command line argument");
			return;
		}
		int n=Integer.parseInt(args[0]);
		System.out.println("Number is  ::  "+n);
		System.out.println("------------------------");
		System.out.println(" Divisibles are --");
		System.out.println("---------------------------");
		int i=1;
		while(i<=n/2)
		{
			if(n%i==0)
				System.out.print(i+ "      ");
			i++;
		}
		System.out.print(n);
		
	}

}
