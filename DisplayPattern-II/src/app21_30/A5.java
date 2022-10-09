package app21_30;

public class A5 {

	public static void main(String[] args) {
		
		for(int l=6, i=1; i<=l-1; i++)
		{
			for(int j=1, c=69+i; j<=l ; j++)
				System.out.print((char)c--+" ");
			System.out.println();
		}
	}
}
