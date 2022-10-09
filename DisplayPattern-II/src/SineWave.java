import java.util.Scanner;

public class SineWave {
	
	static
	{
		System.out.println("This program is of Sine Wave. You have to put Size which denotes height of wave and N value which denotes no. of waves in the program itself");
		System.out.println("You have to enter value of size from  3 to n number where n is suitable value according to your screen ");
		System.out.println("You have to no. of waves value from 1 to n. Here you should know that no of waves should be minimum 1 because if you have enter 0 no pattern will display to you.\n  ");
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of wave : ");
		int size=sc.nextInt();
		System.out.println("\n Enter the no. of waves you want to print: ");
		int n=sc.nextInt();
		
		System.out.println("\n \n Size : "+size+" \t N : "+n);
		for(int i=1; i<=size; i++)
		{
			if(n==1)
			{
				for(int j=1; j<=8; j++)
					if(i==1 && (j==4 || j==5) || i>1 && i<size && (j==3 || j==6) || i==size && ((j>0 && j<3) || (j>6 && j<9)))
						System.out.print("* ");
					else
						System.out.print("  ");
			}
			else
			{
				int loop=n;
				while(loop>=1)
				{
					if(loop==n)
					{
						for(int j=1; j<=8; j++)
							if(i==1 && (j==4 || j==5) || i>1 && i<size && (j==3 || j==6) || i==size && ((j>0 && j<3) || (j>6 && j<9)))
								System.out.print("* ");
							else
								System.out.print("  ");
					}
					else
					{
						for(int j=1; j<=6; j++)
							if(i>1 && i<size &&(j==1||j==4) || i==1 && (j==2 || j==3) || i==size &&(j>4 && j<7))
								System.out.print("* ");
							else
								System.out.print("  ");
					}
					loop--;
				}
			}
			System.out.println();
		}		
	}
}
