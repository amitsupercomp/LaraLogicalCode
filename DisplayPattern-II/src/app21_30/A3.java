package app21_30;

public class A3 {
	
	public static void main(String[] args) {
		
		for(int i=1, l=6; i<=l; i++)
		{
			for(int j=1,c=64+i; j<=l; j++)
				System.out.print((char)c+++" ");
			System.out.println();
		}
	}

}
