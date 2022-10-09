package app81_90;

public class A5 {
	
	public static void main(String[] args) {
		
		for(int i=7; i>=1; i--)
		{
			for(int j=1,n=i; j<=7; j++)
				if(j<i)
					System.out.print("   ");
				else if(i==j || j==7)
					System.out.print(n+" ");
				else if(i==1)
					System.out.print(i+"  ");
				else
				{
					System.out.print("0 ");
				}
			System.out.println();
			
		}
	}

}
