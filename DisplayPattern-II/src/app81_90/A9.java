package app81_90;

public class A9 {

	public static void main(String[] args) {
		
		for(int i=1; i<=6; i++)
		{
			for(int j=1, n=0; j<=6; j++)
				if(j<7-i)
					System.out.print("   ");
				else if(i==6 || j==6 || i+j==7)
					System.out.print("P ");
				else
				{
					System.out.print(n+++" ");
				}
			System.out.println();
		}
	}
}
