package app2;

import java.util.Scanner;

public class M16 
{
	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("main begin");
		try
		{
			System.out.println(1);
			String s1 = sc.next();
			System.out.println(2);
			int i = Integer.parseInt(s1);
			System.out.println(3);
			int j=i/(i-20);
			System.out.println(4);
		}
		catch(ArithmeticException ex)
		{
			System.out.println(5);
		}
		catch(NumberFormatException ex)
		{
			System.out.println(6);
		}
		catch(NullPointerException es)
		{
			System.out.println(7);
		}
		finally
		{
			System.out.println("Finally");
		}
		System.out.println("main end");
	}

}
