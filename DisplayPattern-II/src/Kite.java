import java.util.Scanner;

public class Kite {
	
	static
	{
		System.out.println("This program is of Kite pattern. User should enter the size from 3 and onwards");
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enater the size of kite : ");
		int size=sc.nextInt();
		System.out.println("\nSize : "+size);
		for(int i=1; i<=size*2; i++)
		{
			if(i<=size)
			{
				for(int j=1; j<=size+i-1; j++)
					if(j<size-i+1)
						System.out.print("  ");
					else if(i==1 && j==size)
						System.out.print("^ ");
					else if(j==size)
						System.out.print("| ");
					else if(i+j==size+1)
						System.out.print("/ ");
					else if(j==size+i-1)
						System.out.print("\\ ");
					else
						System.out.print("- ");
			}
			else
			{
				if(i<2*size-1)
				{
					for(int j=1; j<=3*size-i-1; j++)
						if(j==size && i<2*size-1)
						System.out.print("| ");
						else if(j+size<=i)
							System.out.print("  ");
						else if(j==i-size+1)
							System.out.print("/ ");
						else if(j==3*size-i-1)
							System.out.print("\\ ");
						else
							System.out.print("- ");
				}
				
				for(int j=1; j<=size-1 && (i==2*size || i==2*size-1); j++)
					if(j==size-1 && i==2*size)
						System.out.print("~ ~ ~");
					else if(j==size-1 && i==2*size-1)
						System.out.print("/ - \\");
					else
						System.out.print("  ");
					
			}
			System.out.println();
		}
	}
}
