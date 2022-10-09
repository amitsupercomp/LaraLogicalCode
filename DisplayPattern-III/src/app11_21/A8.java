package app11_21;

public class A8 {
	public static void main(String[] args) {
		int size=7;
		for(int i=1; i<=size; i++)
		{
			for(int sp=1; sp<i; sp++)
				System.out.print("   ");
			System.out.print(1);
			if(i<size)
			{
				for(int sp=2*size-2*i; sp>=1; sp--)
					System.out.print("   ");
				System.out.print(1);
			}
			System.out.println();
		}
	}
}
