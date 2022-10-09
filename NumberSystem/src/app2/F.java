package app2;

public class F 
{
	
	public static void main(String[] args) {
		
		if(args.length==0)
		{
			System.out.println("Please enter one int command line argument");
			return;
		}
		
		int i=Integer.parseInt(args[0]);
		int j=i;
		while(j!=0)
		{
			System.out.println(j%10);
			j=j/10;
		}
		
	}

}
