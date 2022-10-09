package app111_120;

public class A5 {
	public static void main(String[] args) {
		int size=5;
		for(int i=1; i<=size; i++)
		{
			for(int j=1; j<=2*size-i; j++)
				if(j<i)
					System.out.print("  ");
				else if(i==1 || j==i || j==2*size-i)
					System.out.print("1 ");
				else
					System.out.print("0 ");
			System.out.println();
		}
	}
}
