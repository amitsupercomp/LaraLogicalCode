package app1;

import java.util.Scanner;

public class B 
{
	public static void main(String[] args) {
		
		System.out.println("main begin");
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter something");
		String str = sc.nextLine();
		System.out.println("You have entered  ::  "+str);
		System.out.println("main end");
	}

}
