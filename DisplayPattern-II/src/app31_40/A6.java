package app31_40;

public class A6 {
	
	public static void main(String[] args) {
		
		for(int i=1, l=9; i<=l; i++)
		{
			for(int j=1; j<=i; j++)
				if(i==1 || i==l || j==1 || j==i)
					System.out.print("0 ");
				else
					System.out.print("1 ");
			System.out.println();
		}
	}

}
