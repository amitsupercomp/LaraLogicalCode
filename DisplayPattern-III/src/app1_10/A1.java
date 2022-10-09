package app1_10;

public class A1 extends Pattern
{
	public static void main(String[] args) 
	{
		int size=5;
		for(int i=1; i<=size*2; i++)
		{
			if(i<=size)
			{
				spaceTop(size,i);
				printElementTop(i);
			}
			else
			{
				spaceBottom(size,i);
				printElementBottom(size,i);
			}
			System.out.println();
		}
		
	}
}
