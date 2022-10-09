package app21_30;

public class A1
{
	public static void main(String[] args) {
		
		for(int i=1; i<=5;i++)
		{
			for(int j=5; j>=i; j--)
				System.out.print(j+" ");
			System.out.println();
		}
	}

}
