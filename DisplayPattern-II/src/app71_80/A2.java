package app71_80;

public class A2 {

	public static void main(String[] args) {
		
		for(int i=7, n=1; i>=1; i--, n++)
		{
			for(int j=7; j>=1; j--)
				if(j>i)
					System.out.print("   ");
				else
					System.out.print(n+" ");
			System.out.println();
		}
	}
}
