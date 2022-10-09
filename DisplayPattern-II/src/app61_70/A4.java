package app61_70;

public class A4 {

	public static void main(String[] args) {
		char c='E', c1;
		for(int i=5; i>=1; i--)
		{
			c1=c;
			for(int j=i; j>=1; j--)
				System.out.print(c1--+" ");
			c--;
			System.out.println();
		}
	}
}
