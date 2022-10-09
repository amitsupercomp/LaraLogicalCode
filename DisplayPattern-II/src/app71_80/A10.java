package app71_80;

public class A10 {

	public static void main(String[] args) {
		
		char c='P';
		for(int i=1; i<=7; i++, c='P')
		{
			for(int j=1; j<=7; j++)
				if(j<i)
					System.out.print("   ");
				else
					System.out.print(c+++" ");
			System.out.println();
		}
		
	}
}
