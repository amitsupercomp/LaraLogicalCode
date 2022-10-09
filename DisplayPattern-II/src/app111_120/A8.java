package app111_120;

public class A8 {
	public static void main(String[] args) {
		int size=5;
		char c='p';
		for(int i=1; i<=size; i++, c='p')
		{
			for(int j=1; j<=2*size-i; j++,c++)
				if(j<i)
					System.out.print("  ");
				else if(i==j || j==2*size-i)
					System.out.print(c+" ");
				else
					System.out.print("0 ");
			System.out.println();
		}
	}
}
