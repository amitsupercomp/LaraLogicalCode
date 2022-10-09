package app71_80;

public class A4 {

	public static void main(String[] args) {
		
		for(int i=7;i>=1; i--)
		{
			for(int j=7; j>=1; j-- )
				if(j>i)
					System.out.print("   ");
				else
					System.out.print(i+" ");
			System.out.println();
		}
	}
}
