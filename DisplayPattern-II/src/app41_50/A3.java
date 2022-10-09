package app41_50;

public class A3 {
	
	public static void main(String[] args) {
		char c='A';
		for(int i=1; i<=6; i++, c++)
		{
			for(int j=1; j<=i ; j++)
				System.out.print(c+" ");
			System.out.println();
		}
	}

}
