package app101_110;

public class A3 {
	public static void main(String[] args) {
		int size= 6;
		char c;
		for(int i=1; i<=size;i++)
		{
			c='a';
			for(int j=1; j<=size+i-1; j++)
				if(j<size-i+1)
					System.out.print(" ");
				else if(j==size+i-1 || i+j-1==size || i==size)
					System.out.print("1 ");
				else
					System.out.print(c+++" ");
			System.out.println();
		}
	}
}
