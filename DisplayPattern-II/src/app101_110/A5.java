package app101_110;

public class A5 {
	public static void main(String[] args) {
		int size=5;
		for(int i=1; i<=size; i++)
		{
			for(int j=1,n=2*size-2*i+1; j<=size+i-1;j++)
				if(j<size-i+1)
					System.out.print("  ");
				else
					System.out.print(n+++" ");
			System.out.println();
		}
		
	}
}
