package app41_50;

public class A10 {
	
	public static void main(String[] args) {
		
		
		char c = 'P';
		for(int i=1; i<=5; i++, c=(char)((int)'P'+i-1))
		{
			for(int j=1; j<=i; j++,c--)
				if(j==1 || j==i)
					System.out.print(c+" ");
				else
					System.out.print("0 ");
			System.out.println();
		}
		
	}
	

}
