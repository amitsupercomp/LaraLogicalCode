
public class Assign2 {

	public static void main(String[] args) 
	{
		if(args.length==0)
		{
			System.out.println("Please enter one int value as command line argument");
			return;
		}
		int n=Integer.parseInt(args[0]);
		int sum=0;
		int j=n;
		int count=1;
		while(j!=0)
		{
			sum=sum+(j%10);
			j=j/10;
			count=count*10;
		}
		count=count/10;
		if(sum%2==1)
		{
			while(n!=0)
			{
				
				System.out.println(n%10);
				n=n/10;
			}
		}	
		else
		{
			while(count!=0)
			{
				System.out.println((n/count)%10);
				count/=10;
			}
		}

	}

}
