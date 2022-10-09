package app111_120;

public class A4 {
	
	public static void main(String[] args) {
		int size=5;
		for(int i=1; i<=size; i++)
		{
			for(int j=1,n=1; j<=2*size-i; j++)
				if(j<i)
					System.out.print("   ");
				else
					System.out.print(n+++" ");
			System.out.println();
		}
	}

}
