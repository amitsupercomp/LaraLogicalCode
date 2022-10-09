import java.util.Scanner;

public class Stair {
	
	static
	{
		System.out.println("Enter the size of stair in integer value");
	}
	
	public static void main(String[] args) {
		
		System.out.println("Enter the size : ");
		Scanner sc = new Scanner(System.in);
		int size=sc.nextInt();
		System.out.println("\n \t Size  :   "+size+"\n");
		
		for(int i=1; i<=size*(size/2+1); i++)
		{
			for(int j=1; j<=size+2; j++)
				if(j==1 || j==size+2)
					System.out.print("┃");
				else if(i%(size/2+1)==0)
						System.out.print("━");
				else
						System.out.print(" ");
			System.out.println();				
		}
		
		for(int i=1; i<=size/2; i++)
		{
			for(int j=1; j<=size+2; j++)
				if(j==1 || j==size+2)
					System.out.print("┃");
				else
					System.out.print(" ");
			System.out.println();
		}
		
		
	}

}
