package app31_40;

public class A8 
{
	public static void main(String[] args) {
		
		for(int i=1, c=65; i<=5; i++, c+=2)
		{
			for(int j=1; j<=4+i; j++)
				if(j<=5-i)
					System.out.print("   ");
				else
					System.out.print((char)c+ " ");
			System.out.println();
		}
		
	}

}
