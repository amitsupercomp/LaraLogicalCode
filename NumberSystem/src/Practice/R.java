package Practice;

/**	Print non prime fibonacci Series till 1000*/
public class R 
{
	public static void main(String[] args) {
		
		int n1=0, n2=1;
		boolean isPrime;
		System.out.println(n1);
		System.out.println(n2);
		n2=n1+n2;
		n1=n2-n1;
		System.out.println(n2);
		while(n2<=1000)
		{
			isPrime=true;
			n2=n1+n2;
			n1=n2-n1;
			for(int j=2; j<=n2/2; j++)
				if(n2%j==0)
				{
					isPrime=false;
					break;
				}
			if(!isPrime)
				System.out.println(n2);
			
			
		}
		
	}

}
