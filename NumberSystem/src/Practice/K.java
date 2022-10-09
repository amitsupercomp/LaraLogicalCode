package Practice;

public class K
{
	public static void main(String[] args) {
		
		printPrimeFib();
	}

	
	private static void printPrimeFib()
	{
		int n1=0, n2=1;
		boolean check=true;
		while(n2<=5000)
		{
			if(n1+n2>5000)
				break;
			for(int j=2; j<=n2/2; j++)
			{
				if(n2%j==0)
				{
					check=false;
					break;					
				}
			}
			if(check)
				System.out.println(n2);
			n2=n1+n2;
			n1=n2-n1;
			check=true;
		}
	}
}
