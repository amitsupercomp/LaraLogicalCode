package Practice;

import java.util.Scanner;

public class S 
{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num=sc.nextInt();
		
		int n=num;
		int sum=0;
		while(n!=0)
		{
			if(n==num || n<10)
				sum+=n%10;
			n=n/10;
		}
		boolean isPrime=true;
		for(int j=2; j<=sum/2; j++)
			if(sum%j==0)
			{
				isPrime=false;
				break;
			}
		if(isPrime)
			System.out.println("java");
		else
			System.out.println("j2ee");
		sc.close();
	}

}
