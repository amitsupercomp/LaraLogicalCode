package app61_70;

public class A7 {

	public static void main(String[] args) {
		
		char c='P';
		for(int i=5; i>=1; i--, c='P')
		{
			for(int j=i; j>=1; j--)
				System.out.print(c+++" ");
			System.out.println();
		}
	}
}
