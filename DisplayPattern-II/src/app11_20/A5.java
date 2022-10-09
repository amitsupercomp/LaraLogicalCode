package app11_20;

public class A5 {
	
	public static void main(String[] args) {
		
		for(int i=1, l=6; i<=l; i++)
		{
			for(int j=1; j<=l; j++)
				if(i==1 || i==l || j==1 || j==l)
					System.out.print("0 ");
				else
					System.out.print("1 ");
			System.out.println();
		}
	}

}
