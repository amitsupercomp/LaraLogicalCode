package app81_90;

public class A6 {

	public static void main(String[] args) {
		
		for(int i=6,c=65; i>=1; i--, c=71-i)
		{
			for(int j=1; j<=6; j++)
				if(j<i)
					System.out.print("   ");
				else
					System.out.print((char)c--+" ");
			System.out.println();
		}
	}
}
