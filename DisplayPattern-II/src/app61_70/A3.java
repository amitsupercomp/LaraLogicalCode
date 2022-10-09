package app61_70;

public class A3 {

	public static void main(String[] args) {
		char c='E';
		for(int i=5; i>=1; i--)
		{
			for(int j=i; j>=1; j--)
				System.out.print(c+" ");
			c--;
			System.out.println();
		}
	}
}
