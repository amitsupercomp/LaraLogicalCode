package NumberSystem;

public class A6 
{
	
	public static void main(String[] args) {
		
		int n=1,count=0,sum=0;
		boolean primeChk;
		while(count<30)
		{
			primeChk=true;
			for(int j=2; j<=n/2; j++)
				if(n%j==0)
				{
					primeChk=false;
					break;
				}
			if(primeChk)
			{
				sum+=n;
				count++;
			}
			n++;
		}
		System.out.println("Sum of intial 30 prime number is  :::   "+sum);
	}

}
