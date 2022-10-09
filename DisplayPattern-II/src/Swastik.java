import java.util.Scanner;

public class Swastik {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size in which you want show a Swastik");
		int size=sc.nextInt();
		for(int i=1; i<=size; i++)
		{
			if(i<=size/2+1)
			{
				int s=size/2+1;	
				for(int j=1; j<=size; j++)
					if(i==size/2+1 || j==1 || j==size/2+1 || i==1 &&  j>size/2)
						System.out.print("* ");
					else
						System.out.print("  ");
			}
			else
			{
				for(int j=1; j<=size; j++)
					if(	j==size/2+1 || j==size || i==size && j<=size/2+1)
						System.out.print("* ");
					else
						System.out.print("  ");
			}
			System.out.println();
		}
	}
}
