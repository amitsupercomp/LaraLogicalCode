package NumberSystem;

import java.util.Scanner;

public class A7
{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a  first number");
		int n1=sc.nextInt();
		System.out.println("Enter a  second number");
		int n2=sc.nextInt(), sum=0;
		boolean primeChk;
		while(n1<=n2)
		{
			primeChk=true;
			for(int j=2; j<=n1/2; j++)
				if(n1%j==0)
				{
					primeChk=false;
					break;
				}
			if(primeChk)
				sum+=n1;
			n1++;
		}
		System.out.println("Sum of prime numbers which are between two numbers  is  :::    "+sum);
		sc.close();
	}

}
