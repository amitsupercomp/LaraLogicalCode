package app91_100;

public class A9 {
	public static void main(String[] args) {
		int size=6;
		char c='a';
		for(int i=1; i<=2*size-1; i++)
		{
			c='a';
			if(i<=size)
				for(int j=1; j<=i; j++, c++)
					System.out.print(c+" ");
			else
				for(int j=2*size-i; j>=1; j--, c++)
					System.out.print(c+" ");
			System.out.println();
		}
	}

}
