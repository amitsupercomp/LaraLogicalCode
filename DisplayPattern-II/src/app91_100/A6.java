package app91_100;

public class A6 {
	public static void main(String[] args) {
		int size=6;
		for(int i=1; i<=2*size-1; i++)
		{
			if(i<=size)
				for(int j=1; j<=i; j++)
					if(j==1 || i==j)
						System.out.print("1 ");
					else
						System.out.print("0 ");
			else
				for(int j=2*size-i; j>=1;j--)
					if(j==2*size-i || j==1)
						System.out.print("1 ");
					else
						System.out.print("0 ");
			System.out.println();
		}
	}

}
