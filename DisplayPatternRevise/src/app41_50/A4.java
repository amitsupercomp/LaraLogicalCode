package app41_50;

public class A4 
{
	
	public static void main(String[] args) {
		
		for(int i=1; i<=5; i++)
		{
			for(int j=4, c=66; j>=1-i; j--)
				if(j>=i)
					System.out.print("   ");
				else if(j<i && j>=0)
					System.out.print((char)(65+j)+" ");
				else
					System.out.print((char)c+++" ");
			System.out.println();
		}

}
}
