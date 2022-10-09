package app1;

import java.util.Scanner;

public class A {

	public static void main(String[] args) {
		
		System.out.println("main begin");
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter something");
		String str = sc.next();
		System.out.println("You have entered  ::  "+str);
		System.out.println("main end");
	}
}


//by using scanner we can take input.
//System.in 