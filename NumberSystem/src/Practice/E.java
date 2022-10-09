package Practice;

public class E 
{
	public static void main(String[] args) {
		
		int n=7,	sum=n+1;
		for(int i=2; i<=n/2; i++)
			if(n%i==0)
				sum+=i;
		System.out.println("Sum is ::  "+sum);
	}
	

}
