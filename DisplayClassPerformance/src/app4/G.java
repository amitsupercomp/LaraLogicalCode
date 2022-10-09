package app4;

public class G
{
	
	public static void main(String[] args)
	{
		
		for(int i=1, l=25; i<=l; i++)
		{
			if(i<=l/2+1)
			{
				for(int sp=l/2; sp>=i; sp--)
					System.out.print(" ");
				for(int p=1; p<=i; p++)
					System.out.print(" *");
			}
			else
			{
				for(int sp=l/2+1; sp<i; sp++)
					System.out.print(" ");
				for(int p=1; p<=l-i+1; p++)
					System.out.print(" *");
				
			}
			System.out.println();
		}
		
		
	}

}
