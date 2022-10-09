package app11_21;

public class A4 {
	public static void main(String[] args) {
		int size=5;
		char c='a';
		for(int i=1; i<=2*size-1; i++, c++)
		{
			if(i<=size)
			{
				for(int sp=i; sp<size; sp++)
					System.out.print("   ");
				System.out.print(c);
			}
			else
			{
				for(int sp=i; sp>size; sp--)
					System.out.print("   ");
				System.out.print(c);
			}
			System.out.println();
		}
	}
}
