package app11_20;

public class A13
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		for(char i=65; i<=69; i++)
		{
			for(int j=65; j<=i; j++)
			{
				System.out.print(i);
				if(j==65)
					System.out.print(" ");
			}
			System.out.println();
		}

	}

}
