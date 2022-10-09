package app71_80;

public class A7 {

	public static void main(String[] args) {
		
		for(int i=1; i<=5; i++)
		{
			for(int j=1,n=i; j<=5; j++)
				if(j<i)
					System.out.print("   ");
				else
					System.out.print(n+++" ");
			System.out.println();
		}
	}
}
