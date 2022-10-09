package app11_21;

public class A11 {

	public static void main(String[] args) {
		int size=5;
		char c='r';
		for(int i=1; i<=size; i++,c='r')
		{
			for(int s=i; s<size; s++)
				System.out.print("   ");
			for(int j=1; j<=i; j++,c++)
				if(j==1 || j==i)
					System.out.print(c+"    ");
				else
					System.out.print("      ");
			System.out.println();
		}
	}
}
