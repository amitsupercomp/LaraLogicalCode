import java.util.Scanner;

public class Butterfly 
{
	
	static
	{
		System.out.println("This is program to print butterfly pattern. User should give size as input from 5 to n number, where n is integer number.\n");
	}
	
	public static void main(String[] args) 
	{

		System.out.println("Enter a size of butterfly ...\n");
		Scanner sc = new Scanner(System.in);
		int size= sc.nextInt();
		System.out.println("\n   \t  Size  :  "+size+"\n\n");
		
		for(int i=1; i<=size*2-1; i++)
		{
			if(i<=size)
			{
				for(int j=1; j<=size*2-1; j++)
					if(j<i)
						System.out.print(" ");
					else if(i==j || j==i*2-1)
						System.out.print("*");
					else if(i>2 && i<=size && j<i*2-1)
							System.out.print("-");
					else
						System.out.print(" ");
			 for(int j=size; j>=1; j--)
					if(j>i)
						System.out.print("  ");
					else if(j==i || j==1)
						System.out.print("*");
					else if(i>2 && i<=size && j>1)
						System.out.print("-");
					else
						System.out.print(" ");
						
			}
			else
			{
				for(int j=1; j<=size*2-1; j++)
					if(j<2*size-i-1)
						System.out.print(" ");
					else if(j==2*size-i || j==4*size-2*i-1)
						System.out.print("*");
					else if(i<2*size-2 && i>size && j<4*size-2*i-1 && j>2*size-i)
						System.out.print("-");
					else
						System.out.print(" ");
				
				for(int j=1; j<=size; j++)
					if(j<=i-size)
						System.out.print("  ");
					else if(j==i-size+1 || j==size)
						System.out.print("*");
					else
						System.out.print("-");				
			}
			System.out.println();
		}
		
	}

}
