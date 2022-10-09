package app101_110;

public class A6 {
	public static void main(String[] args) {
		int size=6;
		char c='a';
		for(int i=1; i<=size; i++, c='a')
		{
			for(int j=1; j<=size+i-1; j++)
				if(j<=size-i)
					System.out.print("  ");
				else
					System.out.print(c+++" ");
			System.out.println();
		}
	}
}
