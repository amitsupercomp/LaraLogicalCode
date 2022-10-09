package app3;
import java.util.Scanner;
public class C
{
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter a number of rows");
		Scanner sc = new Scanner(System.in);
		int lim=Integer.parseInt(sc.next());
		
		for(int i=1; i<=lim; i++)
		{
			for(int sp=lim; sp>i ; sp--)
				System.out.print(" ");
			for(int n =1 ; n<=(2*i-1); n++)
				System.out.print("1 ");
			System.out.println();
		}

	}

}