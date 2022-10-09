package app11_20;

public class A8 {
	
	public static void main(String[] args) {
		
		for(int i=1, l=7; i<=l; i++)
		{
			for(int j=1, n=4; j<=l-1; j++)
				if(i==1 || i==l || j==1 || j==l-1)
					System.out.print("0 ");
				else
					System.out.print(n--+" ");
			System.out.println();
		}
	}

}
