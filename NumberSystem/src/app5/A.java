package app5;

import java.util.Scanner;

public class A 
{
	public static void main(String[] args)
	{
		
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter a number");
			int num=sc.nextInt();
			
			int i =num;
			int revNum=0;
			int lastDigit;
			while(i!=0)
			{
				lastDigit=i%10;
				revNum=revNum*10 + lastDigit;
				i = i/10;
			}
			
			
			
			System.out.println("Given number      :::   "+num);
			
			System.out.println("Reverse Number   :::   "+revNum);
			
			i=num;
			lastDigit=0;
			revNum=0;
			
			 for(i=num ; i!=0; lastDigit=i%10, revNum=revNum*10+lastDigit, i=i/10);
			 
			 System.out.println(revNum);
				
			
//			while(i!=0)
//			{
//				
//				i=i/10;
//			}
			sc.close();
		
	}

}
