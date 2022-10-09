package app1;

public class I 
{
	public static void main(String[] args)
	{
		int i=11;
		int flag=0;
		for(;i<=200; i+=10,flag=0)
		{
			for(int j=2; j<=i/2; j++)
				if(i%j==0)
				{
					flag=1;
					break;
				}
			if(flag==0)
				System.out.println(i);
		}
		
	}

}
