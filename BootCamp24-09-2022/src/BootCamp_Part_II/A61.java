package BootCamp_Part_II;

public class A61
{
	public static void main(String[] args) {
	
		for(int i=65; i<=70; i++)
		{
			for(int j=70; j>=i; j--)
				System.out.print((char)i+" ");
			System.out.println();
		}
}

}
