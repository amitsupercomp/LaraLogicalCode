package app41_50;

public class A8 {
	
	public static void main(String[] args) {
		char c='P';
		for(int i=1; i<=6; i++, c=(char)((int)'P'-i+1))
		{
			for(int j=1; j<=i; j++)
				System.out.print(c+++" ");
			System.out.println();
		}
	}

}
