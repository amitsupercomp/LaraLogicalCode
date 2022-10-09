package Number;

public class A
{
	public static void main(String[] args) 
	{
		int n=1, sum=0;
		boolean isPrime;
		while(n<=1000)
		{
			isPrime=true;
			for(int j=2; j<=n/2;j++)
				if(n%j==0)
				{
					isPrime=false;
					break;
				}
			if(isPrime && ((n-1)%4!=0))
					sum+=n;
			n++;
		}
		System.out.println("Desired Output   ::::    "+sum);
		
	}

}
