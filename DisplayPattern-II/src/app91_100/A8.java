package app91_100;

public class A8 {
	public static void main(String[] args) {
		int size=6;
		char c='q';
		for(int i=1; i<=2*size-1; i++)
		{
			c='q';
			if(i<=size)
				for(int j=1; j<=i; j++)
					if(j==1 || i==j)
						System.out.print("0 ");
					else
						System.out.print(c+++" ");
			else
				for(int j=2*size-i; j>=1; j--)
					if(j==1 || j==2*size-i)
						System.out.print("0 ");
					else
						System.out.print(c+++" ");
			System.out.println();
		}
	}
}
