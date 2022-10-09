package app101_110;

public class A1 {
	public static void main(String[] args) {
		int size=6;
		for(int i=1; i<=size; i++)
		{
			for(int j=1; j<=size+i-1; j++)
				if(j<=size-i)
					System.out.print("   ");
				else
					System.out.print("1 ");
			System.out.println();
		}
	}
}
