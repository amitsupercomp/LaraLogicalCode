package app71_80;

public class A8 {

	public static void main(String[] args) {
		
		for(int i=1; i<=7; i++)
		{
			for(int j=1; j<=7; j++)
				if(j<i)
					System.out.print("   ");
				else if(i==1 || j==7 || j==i)
					System.out.print("1 ");
				else
					System.out.print("0 ");
			System.out.println();
					
		}
	}
}
