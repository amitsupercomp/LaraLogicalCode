
public class Assign1
{
	public static void main(String[] args) 
	{
		if(args.length==0)
		{
			System.out.println("Please enter one int value as command line argument");
			return;
		}
		int n=Integer.parseInt(args[0]);
		int j=n;
		int count=0;
		while(j!=0)
		{
			count++;
			j=j/10;
		}
		if(count%2==1)
		{
			int c=count/2;
			count=1;
			while(c!=0)
			{
				count=count*10;
				c--;
			}
			System.out.println("Mid num is ::  "+n/count%10);
		}
		else
		{
			int c=count/2-1;
			count=1;
			while(c!=0)
			{
				count=count*10;
				c--;
			}
			System.out.println("Mid num is ::  "+n/count%100);
		}
		
	}

}
