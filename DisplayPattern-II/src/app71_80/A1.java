package app71_80;

public class A1 {

	public static void main(String[] args) {
		for(int i=6; i>=1; i--)
		{
			for(int j=6; j>=1; j--)
				if(j>i)
					System.out.print("   ");
				else
					System.out.print("1 ");
			System.out.println();
		}
	}
}
