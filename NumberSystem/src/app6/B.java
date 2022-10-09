package app6;

public class B 
{
	public static void main(String[] args) {
		int i=0, j=1;
		System.out.println(i);
		System.out.println(j);
		int k;
		while(i+j<1000)
		{
			k=i+j;
			if(nonPrime(k))
			{
				System.out.println(k);
			}
			i=j;
			j=k;
		}
	}
	static boolean nonPrime(int i)
	{
		if(i==1)
			return true;
		boolean isPrime=true;
		for(int j=2; j<=i/2; j++)
			if(i%j==0)
			{
				isPrime=false;
				break;
			}
		return !isPrime;
	}

}
