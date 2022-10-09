package app31_40;

public class A1 {
	
	public static void main(String[] args) {
		
		for(int i=1; i<=6; i++)
		{
			for(int j=1, n=10-i; j<=i; j++)
				System.out.print(n+++" ");
			System.out.println();
		}
	}

}
