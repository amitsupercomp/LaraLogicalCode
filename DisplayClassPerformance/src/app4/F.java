package app4;

public class F 
{
	
	public static void main(String[] args)
	{
		for(int i=1, l=11; i<=l; i++)
		{
			if(i<=l/2+1)
			{
				for(int sp=l/2-i+1; sp>=1; sp-- )
					System.out.print("   ");
				for(int n=i; n>=1; n--)
					System.out.print(n+"  ");
			}
			else
			{
				for(int sp=l/2+1; sp<=i; sp++)
					System.out.print("   ");
				for(int n=(l-i)+1; n>=1; n--)
					System.out.print(n+"  ");
			}
			System.out.println();
		}
	}

}
