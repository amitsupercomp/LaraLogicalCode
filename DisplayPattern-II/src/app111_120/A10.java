package app111_120;

public class A10 {
	public static void main(String[] args) {
		int size=9;
		for(int i=1; i<=size; i++)
		{
			for(int j=1,n=1, n2=2*size-2; j<=2*size-i; j++,n++,n2--)
				if(j<i)
					System.out.print("  ");
				else
				{
					if(i%2==1)
						System.out.print(n+" ");
					else
						System.out.print(n2+" ");
				}
			System.out.println();
		}
	}
}
