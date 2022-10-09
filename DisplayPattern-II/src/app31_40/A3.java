package app31_40;

public class A3 {
	
	public static void main(String[] args) {
		
			for(int i=1, l=5;i<=l; i++, l=5 )
			{
				for(int j=1; j<=i; j++)
					System.out.print(l--+" ");
				System.out.println();
			}
	}

}
