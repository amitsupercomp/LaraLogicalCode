package NumberSystem;

import java.util.Scanner;

public class A1 
{
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a number to check whether a number is prime or not");
		int n=sc.nextInt();
		boolean primeChk=true;
		for(int i=2; i<=n/2; i++)
			if(n%i==0)
			{
				primeChk=false;
				break;
			}
		if(primeChk)
			System.out.println("Number "+n+" is Prime Number");
		else
			System.out.println("Number "+n+" is NOT Prime Number");
	}

}
