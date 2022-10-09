package app81_90;

public class A10 {
	public static void main(String[] args) {
		char c='P';
		for(int i=1; i<=6; i++, c='P')
		{
			for(int j=1, n=0; j<=6; j++)
				if(j<7-i)
					System.out.print("   ");
				else if(i==6 || j==6 || i+j==7)
					System.out.print(c+++" ");
				else
				{
					System.out.print(n+++" ");
					c++;
				}
			System.out.println();
		}
	}

}
