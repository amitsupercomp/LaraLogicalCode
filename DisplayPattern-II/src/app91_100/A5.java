package app91_100;

public class A5 {
	public static void main(String[] args) {
		int size=5;
		for(int i=1; i<=2*size-1; i++)
		{
			if(i<=size)
				for(int j=1; j<=i; j++)
					System.out.print(i+" ");
			else
				for(int j=2*size-i; j>=1; j--)
					System.out.print(2*size-i+" ");
			System.out.println();
		}
	}
}
