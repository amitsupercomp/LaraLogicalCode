package Practice;

import java.util.Scanner;

public class L 
{
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to print binary format");
		int n=sc.nextInt();
		int n1=n;

		//By using String object
		String binary="";
		while(n!=0)
		{
			binary+=(n%2);
			n=n/2;
		}
		for(int i=binary.length()-1; i>=0; i--)
			System.out.print(binary.charAt(i));


		System.out.println();
		//By using numerical operation
		long l=0;
		int count=0;
		while(n1!=0)
		{
			l=(l*10)+(n1%2);
			n1=n1/2;
			count++;
		}
		long l2=0;
		while(count>0)
		{
			//System.out.print(l%10);
			l2=l2*10+l%10;
			l=l/10;
			count--;
		}
		System.out.println(l2);
		sc.close();
	}

}
