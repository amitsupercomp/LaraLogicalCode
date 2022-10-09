package app11_21;

public class A6 {
	public static void main(String[] args) {
		
		int size=7;
		for(int i=1; i<2*size; i++)
		{
			if(i<=size)
			{
				for(int sp=1; sp<i;sp++)
					System.out.print("   ");
				System.out.print(1);
			}
			else
			{
				for(int sp=2*size-1; sp>i; sp--)
					System.out.print("   ");
				System.out.print(1);
			}
			System.out.println();
		}
	}
}
