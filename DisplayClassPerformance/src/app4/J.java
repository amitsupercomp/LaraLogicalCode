package app4;
import java.util.Scanner;
public class J 
{
	public static void main(String[] args) 
	{
		
		for(int i=1, l=11; i<=l; i++)
		{
			for(int sp=l; sp>i; sp--)
				System.out.print(" ");
			for(int j=1; j<=i; j++)
					System.out.print("* ");
			System.out.println();
		}
		
		System.out.println("Are you want to rotate this triangle ?? Y or N");
		
		Scanner sc = new Scanner(System.in);
		
		char op=sc.next().charAt(0);
		if(op=='Y' || op=='y')
		{
			System.out.println("Enter your desired rotation : \t L for LEFT      R for RIGHT     O for OPPOSITE");
			op=sc.next().charAt(0);
			if(op=='L' || op=='l')
			{
				for(int i=1, l=11; i<=l;i++)
				{
					if(i<=l/2+1)
					{
						for(int j=1; j<=i; j++)
							System.out.print("* ");
					}
					else
					{
						for(int j=i; j<=l; j++)
							System.out.print("* ");
					}
					System.out.println();
				}
				
			}
			else if(op=='R' || op=='r')
			{
				for(int i=1, l=11; i<=l; i++)
				{
					if(i<=l/2+1)
					{
						for(int sp=l/2; sp>=i; sp--)
							System.out.print("  ");
						for(int j=1; j<=i; j++ )
							System.out.print("* ");
					}
					else
					{
						for(int sp=i; sp>l/2+1; sp--)
							System.out.print("  ");
						for(int j= i; j<=l; j++)
							System.out.print("* ");
					}
					System.out.println();					
				}
			}
			else if(op=='O' || op=='o')
			{
				for(int i=1, l=11; i<=l; i++)
				{
					for(int sp=1; sp<i; sp++)
						System.out.print(" ");
					for(int j=i; j<=l; j++)
						System.out.print("* ");
					System.out.println();
				}
			}
			else
				System.out.println("Ooopps!! you input a wrong choice");			
		}
		else
			System.out.println("Enjoy Karo ! ! !");		
	}

}
