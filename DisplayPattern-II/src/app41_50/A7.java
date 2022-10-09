package app41_50;

public class A7 {

	public static void main(String[] args) {
		char c='P';
		for(int i=1; i<=7; i++, c='P')
		{
			for(int j=1; j<=i; j++)
				System.out.print(c+++" ");
			System.out.println();
		}
	}
}
