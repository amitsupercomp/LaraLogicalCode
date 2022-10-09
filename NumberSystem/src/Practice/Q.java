package Practice;

public class Q 
{
	
	public static void main(String[] args) {
		
		int n=100;
		boolean isPrime;
		while(n<1000)
		{
			isPrime=true;
			for(int j=2; j<=n/2; j++)
				if(n%j==0)
				{
					isPrime=false;
					break;
				}
			if(isPrime)
				System.out.println(n);
			n++;
		}
	}

}
