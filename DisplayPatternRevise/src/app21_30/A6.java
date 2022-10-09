package app21_30;

public class A6
{
	public static void main(String[] args) {
		
	for(int i=1; i<=5; i++)
	{
		for(int j=5, n=1; j>=1; j--)
			if(j>i)
				System.out.print("  ");
			else
				System.out.print(n++ +" ");
		System.out.println();
	}
	}
}
