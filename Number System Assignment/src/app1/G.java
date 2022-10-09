package app1;

public class G
{
	public static void main(String[] args)
	{
		int num=50;
		boolean isPrime;
		while(num<=100)
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
			}
			num++;
		}
		
	}

}
