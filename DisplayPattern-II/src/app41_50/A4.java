package app41_50;

public class A4 {
	
	public static void main(String[] args) {
		char c= 'A';
		for(int i=1; i<=7; i++,c='A')
		{
			for(int j=1; j<=i; j++)
				System.out.print(c+++" ");
			System.out.println();
		}
	}

}
