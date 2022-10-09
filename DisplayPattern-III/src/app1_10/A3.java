package app1_10;

public class A3 {
	
	public static void main(String[] args) {
		
		int size=5;
		for(int i=1; i<=2*size-1; i++)
		{
			if(i<=size)
			{
				//space printing
				for(int s=i; s<size; s++)
					System.out.print("   ");
				
				//Element
				for(int j=1; j<=i; j++)
					System.out.print(j+" ");
			}
			else
			{
				//space
				for(int s=size; s<i; s++)
					System.out.print("   ");
				//Element
				for(int j=i-size, n=2*i-2*size+1; j<size; j++)
					System.out.print(n+++" ");
			}
			System.out.println();
		}
	}

}
