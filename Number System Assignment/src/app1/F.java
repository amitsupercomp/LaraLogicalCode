package app1;

public class F
{
	public static void main(String[] args)
	{
		int count=0;
		int num=1;
		boolean isPrime;
		while(count<20)
		{
			isPrime=true;
			for(int i=2; i<=num/2; i++)
			{
				if(num%i==0)
				{
					isPrime=false;
					break;
				}
			}
			if(isPrime)
			{
				System.out.print(num+" , ");
				count++;
			}
			num++;
		}
	}

}
