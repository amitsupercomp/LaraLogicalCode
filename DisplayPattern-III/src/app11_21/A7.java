package app11_21;

public class A7 {
	public static void main(String[] args) {
		int size=7;
		char c='i';
		for(int i=1; i<2*size; i++,c++)
		{
			if(i<=size)
			{
				for(int s=1; s<i;s++)
					System.out.print("   ");
				System.out.print(c);
			}
			else
			{
				for(int s=2*size-1; s>i; s--)
					System.out.print("   ");
				System.out.print(c);
			}
			System.out.println();
		}
	}
}
