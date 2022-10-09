package Practice;
import java.util.Scanner;


/**
 * Create a program to claculate decimal value from a given Binary String Format */
public class M
{
	public static void main(String[] args) 
	{		
		
		/**	We use Scanner class for taking input from user	*/
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Binary String");
		
		
		/**	Store input into a String reference variable */
		String str = sc.next();
		
		
		/**	Convert a String into Long value by using valueOf() */
		Long l= Long.valueOf(str);
		
		/**	Take an variable of Double because Math.pow() function returns double value and no need to type casting.	*/
		Double n=0.0;
		
		/** take a variable count which is initialize with 0 because when we convert binary number to decimal then we start with 
		 * right  hand last digit which shows the power of 2 is starts with 0*/
		int count=0;
		
		/**	This while loop would be continue until variable l will not be 0. it will check that if last digit is 1 then it will add value to n 
		 * 	and calculate corresponding value at the perticular position by using Math.pow(). In Math.pow passes two argument 2 and count.
		 * In this function count value is varying from 0 to corresponding value which first digit from left hand side. */
		while(l!=0)
		{
			if(l%10==1)
				n+=power(2, count);
			count++;
			l=l/10;
		}
		System.out.println(n);
		
		
		/**	In this method we do not convert String into any Number
		 * We do operation on String value by using charAt(index) method. To find the last char index we use length() which shows the length
		 * of the String. We set check value as length -1 becuase index is starts with 0. In the loop we check that is the index value is 1 then
		 * it calculate the decimal value by formula  adding correseponding Power of 2 i.e. d1 = d1 + Math.pow(2,c). C starts from 0 to 
		 * last corresponding index of String. and after every calculation index value will be increased by 1 by using ++ operator.
		 * */
		double d1=0.0;
		int check=str.length()-1;
		int c=0;
		while(check>=0)
		{
			if(str.charAt(check)=='1')
				d1=d1+power(2,c);
			check--;
			c++;
		}
		System.out.println((int)d1);
		sc.close();		
	}
	private static int power (int i, int j)
	{
		if(j==0)
			return 1;
		else if(j==1)
			return i;
		int sq=i;
		for(int k=2; k<=j; k++)
			sq=sq*i;
		return sq;
	}
}
