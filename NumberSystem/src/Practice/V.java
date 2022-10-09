package Practice;

import java.util.Scanner;

public class V
{
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num=sc.nextInt();
		int n=num;
		int sum=0;
		boolean check=true;
		while(n!=0)
		{
			if(n%10<(n/10)%10)
			{
				check=false;
				break;
			}
			sum+=n%10;
			n=n/10;				
		}
		if(check)
			System.out.println(sum);
		else
		{
			n=num;
			int count=0; 
			while(n!=0)
			{
				count++;
				n=n/10;
			}
			int p=1,div=1;			
			while(p<=count/2)
			{
				div*=10;
				p++;				
			}
			int right=num%div, left=num/div;			
			System.out.println(left);
			System.out.println(right);
			System.out.println("First half - second half =  "+(left-right));
		}
		sc.close();
	}
}
