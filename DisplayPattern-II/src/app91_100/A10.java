package app91_100;

public class A10 {
	public static void main(String[] args) {
		int size=6;
		char c='p';
		for(int i=1; i<=2*size-1; i++)
		{
			c='p';
			if(i<=size)
				for(int j=1; j<=i; j++,c++)
					if(j==1 || j==i)
						System.out.print(c+" ");
					else
						System.out.print("0 ");
			else
				for(int j=2*size-i; j>=1; j--)
					if(j==1 || j==2*size-i)
					{
						System.out.print(c+" ");
						c=(char)((int)('p')+(i-1));
					}
					else
						System.out.print("0 ");
			System.out.println();
		}
	}
}
