package app81_90;

public class A1 {

	public static void main(String[] args) {
		
		for(int i=1; i<=8; i++)
		{
			for(int j=1,n=1; j<=8; j++)
				if(j<9-i)
					System.out.print("   ");
				else
					System.out.print(n+++" ");
			System.out.println();
		}
	}
}
