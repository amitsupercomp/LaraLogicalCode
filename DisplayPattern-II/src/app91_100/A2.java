package app91_100;

public class A2 {
	public static void main(String[] args) {
		int size=5;
		for(int i=1; i<=2*size-1; i++)
		{
			if(i<=size)
				for(int j=1; j<=i;j++)
					System.out.print(j+" ");
			else
				for(int j=1; j<=2*size-i;j++ )
					System.out.print(j+" ");
			System.out.println();
		}
	}

}
