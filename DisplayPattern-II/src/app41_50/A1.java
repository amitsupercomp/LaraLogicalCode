package app41_50;

public class A1 {

	public static void main(String[] args) {
		
		for(int l=7, i=l; i>=1; i--)
		{
			for(int j=i , n=i; j<=l; j++)
				if(j==l)
					System.out.print("0 ");
				else
					System.out.print(n+++" ");
			System.out.println();
		}
	}
}
