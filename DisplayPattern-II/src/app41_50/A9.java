package app41_50;

public class A9 {

	public static void main(String[] args) {
		char c='P';
		for(int i=1; i<=7; i++,c='P')
		{
			for(int j=1; j<=i; j++, c++)
				if(j==1 || j==i)
					System.out.print(c+" ");
				else
					System.out.print("0 ");
			System.out.println();
		}
	}
}
