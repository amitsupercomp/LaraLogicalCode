package app51_60;

public class A8 {

	public static void main(String[] args) {
		
		for(int i=5; i>=1; i--)
		{
			for(int j=i,n=1; j>=1; j--)
				if(i==5 || j==1)
					System.out.print("0 ");
				else
					System.out.print(n+++" ");
			System.out.println();
		}
	}
}
