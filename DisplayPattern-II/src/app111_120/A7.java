package app111_120;

public class A7 {
	public static void main(String[] args) {
		int size= 5;
		char c='p';
		for(int i=1; i<=size; i++,c='p')
		{
			for(int j=1; j<=2*size-i; j++,c++)
				if(j<i)
					System.out.print("  ");
				else
					System.out.print(c+" ");
			System.out.println();
		}
	}
}
