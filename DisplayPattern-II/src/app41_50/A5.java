package app41_50;

public class A5 {
	
	public static void main(String[] args) {
		
		for(int i=1, c=65; i<=6; i++, c=64+i)
		{
			for(int j=1; j<=i; j++)
				System.out.print((char)(c--)+" ");
			System.out.println();
		}
	}

}
