package app11_20;

public class A11 
{
	
	public static void main(String[] args) {
		
		int n=10;
		int i=2,sum=0;
		while(i<=n/2)
		{
			if(n%i==0)
			sum+=i;
			i++;
		}
		
		System.out.println("Sum  ::  "+sum);
		
	}

}
