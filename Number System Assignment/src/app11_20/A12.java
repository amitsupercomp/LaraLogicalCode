package app11_20;

public class A12 
{
	
	public static void main(String[] args) {
		
		int n=2345655;
		int sum=0;
		while(n>0)
		{
			sum+=(n%10);
			n=n/10;
		}
		
		System.out.println("Sum  ::  "+sum);

		
	}

}
