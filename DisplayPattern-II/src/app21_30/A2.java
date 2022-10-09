package app21_30;

public class A2 {
	
	public static void main(String[] args) {
		
		for(int i=1, l=7; i<=l-2; i++)
		{
			for(int j=1, c=64; j<=l; j++)
				System.out.print((char)(c+i)+" ");
			System.out.println();
		}
	}

}
