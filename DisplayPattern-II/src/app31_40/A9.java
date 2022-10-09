package app31_40;

public class A9 {
	public static void main(String[] args) {
		
		for(int i=1, l=7; i<=l; i++)
		{
			for(int j=1; j<=i; j++)
				if(j==1)
					System.out.print("0 ");
				else
					System.out.print(j-1+" ");
			System.out.println();
		}
	}

}
