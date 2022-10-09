package Practice;

import java.util.Scanner;
/**	This program is to calculate sum of left side digit and right side digit. So we must insert number which has total digits in even numbers */
public class T 
{	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter e number");
		int n=sc.nextInt();
		int n1=n;
		int count=0; 
		while(n1!=0)
		{
			count++;
			n1=n1/10;
		}
		int p=count/2;
		int sumRight=0, sumLeft=0;
		while(n!=0)
		{
			if(count>p)
				sumRight+=n%10;
			else
				sumLeft+=n%10;
			count--;
			n=n/10;
		}
		System.out.println(sumLeft);
		System.out.println(sumRight);
		if(sumLeft>sumRight)
			System.out.println("java");
		else
			System.out.println("j2ee");
		System.out.println(Integer.parseInt("1011111",2));
		System.out.println(Integer.parseInt("1011111"));
		sc.close();		
	}
}
