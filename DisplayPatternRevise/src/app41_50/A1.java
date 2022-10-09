package app41_50;

public class A1 
{
	public static void main(String[] args) {
		
	for(int i=1; i<=5; i++)
	{
		for(int j=1, c=65; j<=4+i; j++)
			if(j<=5-i)
				System.out.print("   ");
			else
				System.out.print((char)c++ +" ");
		System.out.println();
	}
	}

}
