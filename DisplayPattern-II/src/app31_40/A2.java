package app31_40;

public class A2 {
	
	public static void main(String[] args) {
		
		for(int i=1, l=9; i<=l; i++, l=9)
		{
			for(int j=1; j<=i; j++)
				System.out.print(l--+ " ");
			System.out.println();
		}
	}

}
