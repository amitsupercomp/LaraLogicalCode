package app1;

import java.util.Scanner;

public class C
{
	public static void main(String[] args) {
		
		System.out.println("main begin");
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter int value");
		int s= sc.nextInt();
		System.out.println("You have entered  ::  "+s);
		System.out.println("please enter double value");
		double sd= sc.nextDouble();
		System.out.println("You have entered  ::  "+sd);
		System.out.println("please enter boolean value");
		boolean b= sc.nextBoolean();
		System.out.println("You have entered  ::  "+b);
		System.out.println("main end");
	}

}
