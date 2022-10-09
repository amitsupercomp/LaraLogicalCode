package app51_60;

public class A5 {

	public static void main(String[] args) {
		
		for(int i=6; i>=1; i--)
		{
			for(int j=i; j>=1; j--)
				if(i==6 || j==1 || j==i)
					System.out.print("0 ");
				else
					System.out.print("1 ");
			System.out.println();
		}
	}
}
