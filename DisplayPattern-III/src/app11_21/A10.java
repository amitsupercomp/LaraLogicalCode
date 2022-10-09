package app11_21;

public class A10 {
	public static void main(String[] args) {
		int size=5;
		for(int i=1; i<=size; i++)
		{
			for(int s=i; s<size; s++)
				System.out.print("   ");
			for(int j=1; j<=i; j++)
				if(j==1 || j==i)
					System.out.print("1    ");
				else
					System.out.print("      ");
			System.out.println();
		}
	}
}
