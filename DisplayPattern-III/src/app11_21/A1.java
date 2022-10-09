package app11_21;

public class A1 {
	public static void main(String[] args) {
		int size=5;
		for(int i=1; i<2*size;i++)
		{
			if(i<=size)
			{
				for(int sp=i;sp<size; sp++)
					System.out.print("  ");
						System.out.print("1 ");
			}
			else
			{
				for(int sp=i; sp>size; sp--)
					System.out.print("   ");
				System.out.print("1 ");
			}
			System.out.println();
		}
	}
}
