package app91_100;

public class A3 {
	public static void main(String[] args) {
		
		int size=5;
		for(int i=1; i<=2*size-1; i++)
		{
			if(i<=size)
				for(int j=i; j>=1; j--)
					System.out.print(j+" ");
			else
				for(int j=2*size-i; j>=1; j--)
					System.out.print(j+" ");
			System.out.println();
		}
	}
}
