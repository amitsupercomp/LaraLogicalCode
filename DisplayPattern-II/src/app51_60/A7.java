package app51_60;

public class A7 {
	
	public static void main(String[] args) {
		
		for(int i=6; i>=1; i--)
		{
			for(int j=i, n=i-2; j>=1; j--)
				if(i==6 || j==i || j==1)
					System.out.print("0 ");
				else
					System.out.print(n--+" ");
			System.out.println();
		}
	}

}
