package app11_20;

public class A14 
{
	public static void main(String[] args) {
		
		int n=1258;
		int i=2;
		int count=0;
		
		while(i<n)
		{
			if(n%i==0)
			{
				System.out.println(i);
				count++;
			}
			if(count==15)
				break;
			i++;
		}
		
		System.out.println("***********************");
		
		i=1258;
		count=0;
		while(count<15)
		{
			if(i%n==0)
			{
				System.out.println(i);
				count++;
			}
			i++;
		}
	}

}
