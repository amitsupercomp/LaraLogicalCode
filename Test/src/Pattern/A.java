package Pattern;

public class A 
{
	
	public static void main(String[] args) 
	{
		
		char c='a';
		for(int i=5; i>=1; i--, c='a')
		{
			for(int j=1,num=1; j<=i; j++,c++,num+=2)
				if(j%2==1)
					System.out.print(c+""+num+"  ");
				else
					System.out.print((char)(c-32)+""+num+"  ");
			System.out.println();
				
		}
		
		
		//Without using num variable
		
		for(int i=5; i>=1; i--, c='a')
		{
			for(int j=1; j<=i; j++,c++)
				if(j%2==1)
					System.out.print(c+""+(2*j-1)+"  ");
				else
					System.out.print((char)(c-32)+""+(2*j-1)+"  ");
			System.out.println();
				
		}
		
		//Without using character variable
		for(int i=5; i>=1; i--)
		{
			for(int j=1; j<=i; j++)
				if(j%2==1)
					System.out.print((char)(96+j)+""+(2*j-1)+"  ");
				else
					System.out.print((char)(64+j)+""+(2*j-1)+"  ");
			System.out.println();
				
		}
		
	}

}
