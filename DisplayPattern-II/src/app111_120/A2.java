package app111_120;

public class A2 {
	public static void main(String[] args) {
		int size=4;
		for(int i=1; i<=size; i++)
		{
			for(int j=1; j<=2*size-i; j++)
				if(j<i)
					System.out.print("  ");
				else
					System.out.print(i+" ");
			System.out.println();
		}
	}
}
