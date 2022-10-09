package app71_80;

public class A5 {
	
	public static void main(String[] args) {
		
		for(int i=7; i>=1; i--)
		{
			for(int j=7, n=i; j>=1; j--)
				if(j>i)
					System.out.print("   ");
				else
					System.out.print(n--+" ");
			System.out.println();
		}
	}

}
