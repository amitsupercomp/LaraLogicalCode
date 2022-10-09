package app81_90;

public class A2 {
	public static void main(String[] args) {
		
		for(int i=1; i<=7; i++)
		{
			for(int j=1, n=8-i; j<=7; j++)
				if(j<8-i)
					System.out.print("   ");
				else
					System.out.print(n+++" ");
			System.out.println();
		}
		
	}

}
