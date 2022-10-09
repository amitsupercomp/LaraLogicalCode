import java.util.Scanner;

public class Hut {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of hunt in decimal");
		int size=sc.nextInt();
		
		for(int i=1; i<=size; i++)
		{
			for(int j=1; j<=size+i-1; j++)
				if(j<=size-i)
					System.out.print(" ");
				else
					System.out.print("*");
			System.out.println();
		}
		
		for(int i=1; i<=size/2+1; i++)
		{
			for(int j=1; j<=size*2-1; j++)
				if(j<=3 || j>=size*2-4)
					System.out.print("*");
				else
					System.out.print(" ");
			System.out.println();
		}
	}
}
