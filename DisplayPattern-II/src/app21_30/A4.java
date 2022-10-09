package app21_30;

public class A4 {
	public static void main(String[] args) {
		
		for(int l=6, i=l; i>=1; i--)
		{
			for(int j=1; j<=l ; j++)
				System.out.print((char)(64+i)+" ");
			System.out.println();
		}
	}
}
