package app101_110;

public class A2 {
	public static void main(String[] args) {
		int size=6;
		for(int i=1; i<=size; i++)
		{
			for(int j=1; j<=size+i-1; j++)
				if(j<size-i+1)
					System.out.print("   ");
				else if(i+j-1==size || i==size || j==size+i-1)
					System.out.print("1 ");
				else
					System.out.print("0 ");
			System.out.println();
		}
	}
}
