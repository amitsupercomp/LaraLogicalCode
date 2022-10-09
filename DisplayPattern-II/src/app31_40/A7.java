package app31_40;

public class A7 {
	
	public static void main(String[] args) {
		
		for(int i=1,l=8;i<=l; i++ )
		{
			for(int j=1,n=1; j<=i; j++)
				if(i==1 || i==l || j==1 || j==i)
					System.out.print("0 ");
				else
					System.out.print(n+++" ");
			System.out.println();
		}
	}

}
